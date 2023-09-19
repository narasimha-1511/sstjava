import java.util.HashMap;
import java.util.HashSet;

public class difficultq {

    public static int solve(int[] A) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int elem: A){
            if(a.containsKey(elem)){
                int freq=a.get(elem);
                a.put(elem,freq+1);
            }else{
            a.put(elem,1);
            }
        }
        HashSet<Integer> aa = findsplpairs(a,A);

        return 0;
    }

    public static HashSet<Integer> findsplpairs(HashMap<Integer,Integer> a,int A[]){
      HashMap<Integer,Integer> aa = new HashMap<>();
          
        return null;
       }

       public static void iterateUsingLambda(HashMap<Integer, Integer> map) {
           map.forEach((key, value) -> {
               System.out.println("Key=" + key + ", Value=" + value);
           });
       }
    public static void main(String[] args) {
        int A[] ={1,2,3,4,5,6,7,8,1,2,3};
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int elem: A){
            if(a.containsKey(elem)){
                int freq=a.get(elem);
                a.put(elem,freq+1);
            }else{
            a.put(elem,1);
            }
        }
        iterateUsingLambda(a);
    }
}
