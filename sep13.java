import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class sep13 {
    public static int checkpairSum(int []arr1,int target){
        HashSet<Integer> arr = new HashSet<Integer>();
          for(int elem: arr1){
              if(arr.contains(target-elem)){
                  return 1;
              }
            arr.add(elem);
        }
        return 0;
    }

    public static HashSet<Integer> checkRepeteadOddElements(int arr[]){
        HashSet<Integer> ans = new HashSet<>();
        for(int elem: arr){
            if(ans.contains(elem)){
                ans.remove(elem);
            }else{
                ans.add(elem);
            }
        }
        return ans;
    }

    public static HashSet<Integer> checkOddFreqElem(int arr[]){
        HashSet<Integer> ans = new HashSet<>();
        for(int elem: arr){
            if(ans.contains(elem)){
                ans.remove(elem);
            }else{
                ans.add(elem);
            }
        }
        return ans;
    }

    public static void learningHashMap(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // HashMap<Character,Character> map1 = new HashMap<>();
        for(int elem: arr){
            if(map.containsKey(elem)){
                int freq = map.get(elem);
                map.put(elem, freq+1);
            }else{
                map.put(elem, 1);
            }
        } 

        System.out.println(map);
    }


    public static int IsomorphicStrings(String A, String B) {//"xyx","aba"
        HashMap<Integer,Integer> ans = new HashMap<>();
        if(A.length()==B.length()){
        for(int i=0;i<A.length();i++){
            if(ans.containsKey((int)A.charAt(i))){
                if(ans.get((int)A.charAt(i))!=(int)B.charAt(i)){
                    return 0;
                }
            }else{
            ans.put((int)A.charAt(i),(int)B.charAt(i));
            }
        }
        }
        return 1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2};
       // System.out.println(checkpairSum(arr,6));
       System.out.println(checkRepeteadOddElements(arr));

       int a[] ={1,2,3,4,5,6,7,8,9,5,6,4,7,8,9,1,2,3,-1,2,-3,0};
       learningHashMap(a);

       //Solveing todays problems
       String aaa = "Narasimha";

        HashMap<Character,Character> ans = new HashMap<>();
        //  ans.
    //    for(char elem: aaa.toCharArray()){
    //     System.out.println(elem);
    //     }
    System.out.println(IsomorphicStrings("xyx","cvv"));
    }
}
