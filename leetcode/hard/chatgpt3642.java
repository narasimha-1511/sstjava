package leetcode.hard;
import java.util.*;

class Graph {
    Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();

    public Graph(int n, int[][] edges) {
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashMap<>());
        }

        for (int[] mapping : edges) {
            int start = mapping[0];
            int end = mapping[1];
            int cost = mapping[2];

            Map<Integer, Integer> current = graph.get(start);
            current.put(end, cost);
            graph.put(start, current);
        }
    }

    public void addEdge(int[] edge) {
        int start = edge[0];
        int end = edge[1];
        int cost = edge[2];

        Map<Integer, Integer> current = graph.get(start);
        current.put(end, cost);
        graph.put(start, current);
    }

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        Graph graph = new Graph(n, edges);
        int minCities = Integer.MAX_VALUE;
        int resultCity = -1;

        for (int startCity = 0; startCity < n; startCity++) {
            int reachableCities = 0;
            for (int endCity = 0; endCity < n; endCity++) {
                if (startCity != endCity && graph.shortestPath(startCity, endCity, distanceThreshold)) {
                    reachableCities++;
                }
            }

            if (reachableCities <= minCities) {
                minCities = reachableCities;
                resultCity = startCity;
            }
        }

        return resultCity;
    }

    public boolean shortestPath(int node1, int node2, int distanceThreshold) {
        return shortestPath(node1, node2, new HashSet<>(), distanceThreshold);
    }

    private boolean shortestPath(int node1, int node2, Set<Integer> visited, int distanceThreshold) {
        if (node1 == node2) {
            return true;
        }

        visited.add(node1);
        Map<Integer, Integer> getNodes = graph.get(node1);

        for (Integer key : getNodes.keySet()) {
            if (!visited.contains(key) && getNodes.get(key) <= distanceThreshold) {
                if (shortestPath(key, node2, visited, distanceThreshold)) {
                    return true;
                }
            }
        }

        visited.remove(node1);
        return false;
    }

    public void printGraph() {
        for (Map.Entry<Integer, Map<Integer, Integer>> entry : graph.entrySet()) {
            int key1 = entry.getKey();
            Map<Integer, Integer> nestedMap = entry.getValue();

            System.out.println("Key: " + key1);
            for (Map.Entry<Integer, Integer> nestedEntry : nestedMap.entrySet()) {
                int key2 = nestedEntry.getKey();
                int value = nestedEntry.getValue();

                System.out.println("  Nested Key: " + key2 + ", Value: " + value);
            }
        }
    }
}

public class chatgpt3642 {
    public static void main(String[] args) {
        int arr[][] = {{0, 2, 5}, {0, 1, 2}, {1, 2, 1}, {3, 0, 3}};
        Graph obj = new Graph(4, arr);
        System.out.println(obj.findTheCity(4, arr, 7));
    }
}
