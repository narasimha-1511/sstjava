import java.util.Arrays;

public class sep20 {
    public static int MaxSubArraySum(int arr[]){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }else{
                if(sum>maxsum){
                    maxsum=sum;
                }
            }
        }
        return maxsum;
    }
    public static int[] sumOfSubMatrix(int arr[][],int A[],int B[],int C[],int D[]){
        //Creating a 2-D Sub Matrix Array
        //ps[i][j] == SumOF(from(0,0)-(i,j))
        /*
         * [a,b,c]
         * [d,e,f]
         * -----Sub Array is
         * [a  , a+b     ,a+b+c]
         * [a+d, a+b+d+e ,a+b+c+a+d+e]
         */
        int newarr[][]  = new int[arr.length][arr[0].length];
        //Prefix sum Of the 2D Array

        //Filling First Column With
        for(int i=0;i<arr.length;i++){
            newarr[i][0]=arr[i][0];
        }
        //Summation row
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                newarr[i][j] = newarr[i][j-1]+arr[i][j];
            }
        }
        // Summation Column
        for(int j=0;j<arr[0].length;j++){
            for(int i=1;i<arr.length;i++){
             newarr[i][j] += newarr[i-1][j];
            }
        }
        //Now Our Prefix Sum Matrix is Ready
        //Calculate Queries 
        int sum[] =new int[A.length];

        for(int a=0;a<A.length;a++){
            int i =A[a];
            int j= B[a];
            int p= C[a];
            int q= D[a];
            if(i==0&&j==0)
            sum[a] =  newarr[p][q];
            else if(i==0)
            sum[a] =newarr[p][q] - newarr[p][j-1];
            else if(j==0)
            sum[a] = newarr[p][q] - newarr[i-1][q];
            else 
            sum[a]= newarr[p][q] - newarr[i-1][q] - newarr[p][j-1] + newarr[i-1][j-1];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        
        System.out.println(Arrays
                .toString(sumOfSubMatrix(arr, new int[] { 1,2 }, new int[] { 1,2 }, new int[] { 2,3 }, new int[] { 2,3 })));
     

            int arr1[] = {2,5,-10,4,8,-1,5,-14,-20,0};
            System.out.println(MaxSubArraySum(arr1));
    }
}