import java.util.Arrays;

//Binary Search   

public class nov6 {

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end)/ 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; 
    }

    public static void rightShift(int a[],int i,int j){
        int fe = a[i];
        for(;i<j;i++){
            a[i]=a[i+1];
        }
        a[j]=fe;
    }

    public static void reaarrage(int a[]){
        int LastElement=a[a.length-1];
        for(int i=0;i<a.length-1;i++){
            if(a[i]>LastElement){
                rightShift(a, i, a.length-1);
                System.out.println(Arrays.toString(a));
            }
        }
    }

    public static void reaarrageTwoPointer(int a[]){
        int LastElement = a[a.length-1];
        int i=1,j=0;
        while(i<a.length){
            //i iterates over the loop
            //j contains the least index of highest number to be swapped with
            if(a[i]<LastElement){
                swap(a,i,j);
                j++;      
            }
            i++;
        }
        //after completing exchange with the i and j
        swap(a, i-1, j);
    }
    public static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        int a[] = {9,8,1,6,5,11,4,7};
        reaarrageTwoPointer(a);
         System.out.println(Arrays.toString(a));
    }
}
