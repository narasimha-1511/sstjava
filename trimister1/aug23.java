public class aug23 {

    public static void PrintElemntsDiagonallyFromGivenPoint(int[][] a, int row, int col) {

        while (col < a[0].length && row < a.length) {
            System.out.print(a[row][col] + " ");
            col++;
            row++;
        }
        System.out.println();
    }

    public static void PrintAllDiagonalElementsFromLeftToRight(int a[][]){

      //To Print The Diagonals Diagonnaly From Last Row TO First Row
      for(int i=a.length-1;i>=0;i--)
      PrintElemntsDiagonallyFromGivenPoint(a, i, 0);

      for(int i=1;i<a[0].length;i++)//This Is for Column Elemnts Diagonally
      PrintElemntsDiagonallyFromGivenPoint(a, 0, i);

    }

    public static int frequency(int a[], int target){
        int freq=0;
        for(int i=0;i<a.length;i++){
            if(target==a[i]){
                freq++;
            }
        }
        return freq;
      }


    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 4 },
                { 5, 6, 7 },
                { 3, 5, 6 }
        };
        PrintAllDiagonalElementsFromLeftToRight(a);
    }
}
