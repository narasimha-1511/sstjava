import java.util.ArrayList;
import java.util.Arrays;

public class oct3 {
    public static int zomato(int arr[]){
        
        Arrays.sort(arr);
        int sum=0;
        int ans=0;
        for(int elem:arr){
            sum+=elem;
        }
        for(int i=arr.length-1;i>=0;i--){
            ans+=sum;
            sum-=arr[i];
        }
        return ans;
        
    }

    public static ArrayList<Integer> NobleIntegers(int arr[]){
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int elem =arr[i];
            if(elem>=0){
                if(elem==i){
                    ans.add(elem);
                }
            }
        }
        return ans;
    }
    public static void Bubblesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean swap=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap=true;
                    swap(arr,j,j+1);
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr [j] = temp;
    }
    public static void main(String[] args) {
        System.out.println(zomato(new int[]{2,1,4}));
        System.out.println(NobleIntegers(new int[]{-1,-5,3,5,-10,4}));

        //Sorting Algorithms
        //Bubble Sort
        Bubblesort(new int[]{5,6,9,4,3,2,8});
    }
}
