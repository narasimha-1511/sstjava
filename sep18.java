import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class sep18 {
    public static int PickfromBothSides(int arr[],int B){

        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        //prefix array is ready

        int sum=Integer.MIN_VALUE;
        //Run Loop b Times -- find all ranges
        for(int i=0;i<B;i++){
            //Try Various ranges Possible from first and last   
        }

    return 0;
    }

    public static boolean CheckIfSumOfSubArrayIsZero(int arr[]){//O(N) -- Time Complexity
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        HashSet<Integer> set = new HashSet<>();
        set.add(prefix[0]);
        //Will Iterate over the Prefix and Check if Two ELement are same
        //That Means There Exists a Sub Array with sum = 0 
        for(int i=1;i<arr.length;i++){
        prefix[i]=prefix[i-1]+arr[i];
        if(prefix[i]==0){
            return true;
        }
        if(!set.contains(prefix[i])){
            set.add(prefix[i]);
        }else{
            return true;
        }
        }
        return false;
    }

    public static ArrayList<Integer> CountOfSpecialIndexes(int arr[]){//O(N)--TimeComplexity
        //Special Indexes are Those for Which On Removing an Element
        //Sum of all Even elem == Sum of all od indexes
       
    /*  This is the Best Approach
        Initially Create a Subarray deleting the Zero'th Index
        Next Iterate a Loop N-1 times
        replace the Ith element with Ith element of the arr
        Now Calculate the diff and add it accordingly to even sum or odd sum  */

        ArrayList<Integer> ans = new ArrayList<Integer>();
        int subArr[] = new int[arr.length-1];  

        int es=0,os=0;
        for(int i=1;i<arr.length;i++){
            subArr[i-1]=arr[i];
            if(i%2==1)es+=arr[i];
            else os+=arr[i];
        }

        if(es==os)ans.add(0);
        
        for(int i=0;i<arr.length-1;i++){
            int diff = arr[i] - subArr[i];
            if(i%2==0)es+=diff;
            else os+=diff;
            if(es==os){
                ans.add(i+1);
            }
        }
        return ans;
    }

    /*
     * 
     */


    public static void main(String[] args) {
        //For check Sum od subarry is zero
        // int test1[] = {4,2,-3,1,6};
        // int test2[] = {1,3,4,2,0,6,7};
        // int test3[] = {2,4,-2,1,4-2};
        // int test4[] = {1,2,-3,4,5};
        // System.out.println(CheckIfSumOfSubArrayIsZero(test1));
        // System.out.println(CheckIfSumOfSubArrayIsZero(test2));
        // System.out.println(CheckIfSumOfSubArrayIsZero(test3));
        // System.out.println(CheckIfSumOfSubArrayIsZero(test4));

        int arr[] = {4,3,2,7,6,-2};
        System.out.println((CountOfSpecialIndexes(arr)));


    }
}