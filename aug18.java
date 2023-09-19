import java.util.Scanner;
import java.awt.Desktop;
public class aug18{


    public static void printmatrix(int[][] a){
     int rows = a.length;
     int columns = a[0].length;
     for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
             System.out.print(a[i][j]+" ");
            }System.out.println();
        }

    }
    public static void printmatrixTranspose(int[][] a){
     int rows = a.length;
     int columns = a[0].length;
     for(int i=0;i<columns;i++){// i is for columns
            for(int j=0;j<rows;j++){//j is for rows
             System.out.print(a[j][i]+" ");
            }System.out.println();
        }

    }

     public static int[] SumOfAllValues2DInRow(int [][]a){
          int rows = a.length;
     int columns = a[0].length;
     int sum[]= new int[rows];
     for(int i=0;i<rows;i++){// i is for rows
            for(int j=0;j<columns;j++){//j is for columns
             sum[i]+=a[i][j];
            }
        }
     return sum;
    }

    
    public static void printarray(int[] a){
         for(int j=0;j<a.length;j++){
             System.out.print(a[j]+" ");
            }
            System.out.println();
    }
    
    public static int MaxNumber2DArray(int [][]a){
          int rows = a.length;
     int columns = a[0].length;
     int max= a[0][0];
     for(int i=0;i<rows;i++){// i is for rows
            for(int j=0;j<columns;j++){//j is for columns
             if(max<a[i][j]){
              max=a[i][j];
             }
            }
        }
     return max;
    }

    public static int SumOfAllValues2D(int [][]a){
          int rows = a.length;
     int columns = a[0].length;
     int sum= 0;
     for(int i=0;i<rows;i++){// i is for rows
            for(int j=0;j<columns;j++){//j is for columns
             sum+=a[i][j];
            }
        }
     return sum;
    }

    public static void PrintMatrixUpSideDown(int a[][]){
         int rows = a.length;
     int columns = a[0].length;
   
     for(int i=rows-1;i>=0;i--){// i is for rows
            for(int j=columns-1;j>=0;j--){//j is for columns
             System.out.print(a[i][j]+" ");
            }System.out.println();
        }

    }

        public static int IndexRowsMaxSum(int a[][]){//----->>This Function Returs the Index Of the Maximum Sum in The Row
            int rows = a.length;
        int columns = a[0].length;
        int MaxSumRow=0,MaxSum=0,sum= 0;//Integer.MIN_VALUE;
        for(int i=0;i<rows;i++){// i is for rows
                for(int j=0;j<columns;j++){//j is for columns
                sum+=a[i][j];
                }
                if(MaxSum<sum){
                    MaxSum=sum;
                    MaxSumRow=i;
                }
                sum=0;// again sum is intialized to zero-->
            }
        return MaxSumRow;
        }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        // 2D -Arrays
        int rows=3;
        int columns=3;
        int marks[][] = new int[rows][columns];

        // Scanning a Matrix and Printing IT
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<columns;j++){
        //      marks[i][j]=in.nextInt();
        //     }
        // }

        
    //   printmatrix(marks);
      
      int z[][] = {{0,1,2,3,4,5,6,7,999},{1,2,3,4,5,6888,7,8,9},{1,2,3,4,5,6,7,8,99}};
    //   printarray(z);  

    // System.out.println(PrintMatrixUpSideDown(z));

    // PrintMatrixUpSideDown(z);


    //2D-Arayist
        // ArrayList<ArrayList<Integer>> = new Arrayist<Arrayist<>>()();

        //Home -- Work

        /**
         * How to Open A File??? --
         * Help From -- Buffered Image
         * ImageIO --> Read Data
         * Process --> @2D MAtrix
         */

        //-----Home_Work------>>

        //To Open a FIle

        // File file = new File("Narasimha-1.png");


    }
}