import java.util.Arrays;

public class oct5 {
    // Merge Sort
    public static void mergeSortedSubArrays(int arr[], int s, int m, int e) {
        // head
        int i = s;
        int j = m + 1;
        int iterator = 0;
        int sortedSubArray[] = new int[e - s + 1];
        while (i <= m && j <= e) {
            if (arr[i] < arr[j]) {
                sortedSubArray[iterator] = arr[i];
                i++;
            } else {
                sortedSubArray[iterator] = arr[j];
                j++;
            }
            iterator++;
        }
        while (i <= m) {
            sortedSubArray[iterator] = arr[i];
            i++;
            iterator++;
        }
        while (j <= e) {
            sortedSubArray[iterator] = arr[j];
            j++;
            iterator++;
        }
        for (i = 0; i < e - s + 1; i++) {
            arr[s + i] = sortedSubArray[i];
        }
    }

    public static void mergeSort(int arr[], int s, int e) {
        if (s == e)
            return;
        int mid = (s + e) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        mergeSortedSubArrays(arr, s, mid, e);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 4, 2, 3, 5, 6, 9, 8, 9, 10 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
