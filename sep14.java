import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class sep14 {
    /*
     * 
     */

    public static HashMap<Integer,Integer> findAGindexPairs(String a){
        //I am returing the pairs in this answer
        HashMap<Integer,Integer> ans = new HashMap<>();
        ArrayList<Integer> gindexes = new ArrayList<>();
        

        for(int i=a.length()-1;i>=0;i--){
            char A = a.charAt(i);
            if(A=='a'){
                for(int j=0;j<gindexes.size();j++){
                    ans.put(i,gindexes.get(j));
                }
            }else{
                if(A=='g'){
                    gindexes.add(i);
                }
            }
        }

        return ans;
    } 

    public static int findAGPairs(String a){
        //I am returing the pairs in this answer
        //o(N) -->Perfect Solution
    
        int gfreq=0; 
        int ans=0;

        for(int i=a.length()-1;i>=0;i--){
            char A = a.charAt(i);
            if(A=='a'){
                ans+=gfreq;
            }else{
                if(A=='g'){
                    gfreq++;
                }
            }
        }

        return ans;
    }

    //Arraays of integer count --> how many Leaders in the elements of array

    public static int countLeaderElements(int arr[]){
        //Best Solution -- O(N)
        int max = arr[0],count=1;
        for(int elem: arr){
          if(elem>max){
             max = elem;
             count++;
          }
        }
     return count;
    }

    public static int amazonAdobeMsQuestion(int arr[]){
        //Sexiest Solution
        int count=0;
        boolean a=true;
        for(int elem:arr){
            if(a==true){
                if(elem==0){
                    a=false;
                    count++;
                }
            }else{
                if(elem==1){
                    a=true;
                    count++;
                }
            }
        }
      return count;
    }
    public static void main(String[] args) {
        //We Learn About Optimizations
        String str1 = "aaaggg";
        int arr[]={2,3,1,9,4};
        //System.out.println(findAGindexPairs(str1));
        //System.out.println(countLeaderElements(arr));
        int arr1[]={1,0,1,0,1,1,1,0,0};
        System.out.println(amazonAdobeMsQuestion(arr1));

        //Questions


    }
    //--------------------
    public static int getSum(int A, int B, ArrayList<Integer> C) {
        HashMap<Integer,Integer> map = new HashMap<>();
            for(int elem: C){
                
            }
            return 0;
    }
}
