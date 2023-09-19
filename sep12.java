import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class sep12 {

    public static boolean IsPresent(int arr[], int target){//This takes N*Q iterations
        //First Sort the Array and then apply Binary Search
        //bubble,selection,insersion,cycle,(((merge,quick))==>Try to do them)
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)return true;
        }
        return false;
    }

    public static ArrayList<Integer> distinctElemnts(int arr[]){
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[0]!=arr[1]){
            ans.add(arr[0]);
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i+1] && arr[i]!=arr[i-1]){
                ans.add(arr[i]);
            }
        }
        if(arr[arr.length-1]!=arr[arr.length-2]){
            ans.add(arr[arr.length-1]);
        }
      return ans;
    }

    public static ArrayList<Integer> common(int arr1[],int arr2[]){
        ArrayList<Integer> ans = new ArrayList<>();
        
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int queries = in.nextInt();
        //int arr[] ={2,4,3,7,8,1,10,13,15,19};
        // for(int i=0;i<queries;i++){
        //     int target = in.nextInt();
        //     System.out.println(IsPresent(arr, target));
        // }

        int disArr[] ={5,6,4,8,5,9,4,6,2,3,7};
        System.out.println(distinctElemnts(disArr));


        HashSet<Integer> hash = new HashSet<>();

        hash.add(10);
        hash.add(7);

        in.close();
    }
}
