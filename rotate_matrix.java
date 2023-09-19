import java.util.Arrays;

public class rotate_matrix {
    public static int[][] RotateMatrix(int arr[][]){
        int newarr[][] = new int[arr.length][arr[0].length];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                newarr[j][arr[0].length-1-i] = arr[i][j];
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
    int arr[][] ={{1,2},
                  {3,4}};
     arr = RotateMatrix(arr);
     for(int i=0;i<arr.length;i++)
     System.out.println(Arrays.toString(arr[i]));
    }
}