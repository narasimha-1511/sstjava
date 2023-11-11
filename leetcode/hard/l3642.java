package leetcode.hard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class l3642 {
    public static void main(String args[]) {

        int arr[][] = { { 0, 2, 5 }, { 0, 1, 2 }, { 1, 2, 1 }, { 3, 0, 3 } };

        Graph obj = new Graph(4, arr);

        System.out.println(obj.shortestPath(0, 3));

        // obj.printgraph();

        obj.addEdge(new int[] { 1, 3, 4 });

        System.out.println(obj.shortestPath(0, 3));

        // obj.printgraph();
    }
}

class Graph {
    // This is a Graph
    Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();

    public Graph(int n, int[][] edges) {

        // Creating Map for eachIndex
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashMap<Integer, Integer>());
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

    public int shortestPath(int node1, int node2) {
        return shortestPath(node1, node2,new HashSet<Integer>());
    }

    public int shortestPath(int node1, int node2, Set<Integer> visited) {
        if (node1 == node2) {
            // We have reached the destination node, the distance is 0.
            return 0;
        }

        // Mark the current node as visited
        visited.add(node1);

        Map<Integer, Integer> getNodes = graph.get(node1);

        int ans = Integer.MAX_VALUE;

        for (Integer key : getNodes.keySet()) {
            if (!visited.contains(key)) {
                int temp = shortestPath(key, node2, visited);
                if (temp != -1) {
                    if (ans > temp + getNodes.get(key)) {
                        ans = temp + getNodes.get(key);
                    }
                }
            }
        }

        // Unmark the current node as visited (backtrack)
        visited.remove(node1);

        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }

    public void printgraph() {
        // Printing the complete data in the temp variable
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
