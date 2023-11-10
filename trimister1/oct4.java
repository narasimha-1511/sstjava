import java.util.Arrays;

public class oct4 {
    public static void inserstionSort(int arr[]){
        //First run loop N-1 Times
        //Sort the array from the left side inserting each element
        for(int i=1;i<arr.length;i++){
            //sorting the left side array
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j-1, j);
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeArrays(int arr1[],int arr2[]){
        int arr[] = new int[arr1.length+arr2.length];
        int arr1p = 0;
        int arr2p = 0;
        int Iterator=0;
        while(arr1p<arr1.length && arr2p<arr2.length){
            
            if(arr1[arr1p]>arr2[arr2p]){
                arr[Iterator]=arr2[arr2p];
                arr2p++;
            }else{
                arr[Iterator]=arr1[arr1p];
                arr1p++;
            }
            Iterator++;
            
        }
        if(Iterator!=arr.length){
            if(arr1p!=arr1.length){
                for(int i=arr1p;i<arr1.length;i++){
                    arr[Iterator]=arr1[i];
                    Iterator++;
                }
            }
            if(arr2p!=arr2.length){
                for(int i=arr2p;i<arr2.length;i++){
                    arr[Iterator]=arr2[i];
                    Iterator++;
                }
            }  
        }
        return arr;
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min = Integer.MAX_VALUE;
            int minindex = 0;
            for(int j=i;j<arr.length;j++){
                if(min>arr[j]){
                    minindex=j;
                    min=arr[j];
                }
            }
            swap(arr,minindex,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    public static int KthminNum(int arr[],int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        // System.out.println(KthminNum(new int[]{1,5,-1,2,10,3}, 3));
        // selectionSort(new int[]{1,5,6,8,9,5,0});
        // inserstionSort(new int[]{7,10,3,-2,5,-1});
        System.out.println(Arrays.toString(mergeArrays( new int[]{2,4,5,11},new int[]{3,8,9,12,13})));
    }
}
