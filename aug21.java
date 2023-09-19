import java.util.Arrays;

public class aug21 {
    // returning the summation of an Array
    public static int[][] sumOfTwoMatrix(int [][]a,int [][]b){
        int sumaa[][] = new int[a.length][];
        //Checking The Length Of Array with respect
        for(int i=0;i<a.length;i++){
            if(a.length != b.length || a[i].length!=b[i].length ){
                throw new RuntimeException("Dimesions Eroorr");
                // return new int[][]{{999},{999,999}};
            }

            }
   
            for(int i=0;i<b.length;i++){
            if(a.length != b.length || a[i].length!=b[i].length)
                            throw new RuntimeException("Dimesions Eroorr");
            //  return new int[][]{{999},{999,999}};
            
            }
        // This is A Summation 
        for(int i=0;i<a.length;i++){
            sumaa[i] = new int[a[i].length];
            for(int j=0;j<a[i].length;j++){
                sumaa[i][j]=a[i][j]+b[i][j];
            }
        }

        return sumaa;
    }

    public static int productOfRowColumn(int[][] a , int[][] b, int ra, int rb){
        int product=0;
        // Here we are Calculating The Product Values Of the ra-th Row of 'a' with rb-th  Colomn of 'b'
        for(int i=0;i<a[ra].length;i++){
            product+=a[ra][i]*b[i][rb];
        }
        return product;
    }

    public static int[][] mulMatrix(int[][] a , int[][] b){
        if(a[0].length!=b.length)//checks the condition of the multiplication of array
        throw new RuntimeException("Condition Did Not Satisfy");
      int ans[][] = new int[a.length][b[0].length];
      
      for(int i=0;i<ans.length;i++){
        for(int j=0;j<ans[i].length;j++){
            ans[i][j]=productOfRowColumn(a,b,i,j);
        }

      }
    
     return ans;
    }

   public static int determinant(int[][] a){
     // ---> Try To Do It Later Returns The Determinant Of The square Matrix

     
      return 0;
   }
    public static void main(String[] args) {
        int a[][] = {
            {1,2,3},
            {1,2,3}

        };
        int b[][] = {
            {1},
            {1},
            {1}
        };
        int ans[][] = mulMatrix(a, b);
        //This Condition Checks If There are any Exceptions
        // if(ans[0][0]==999 && ans[1][0]==999 &&ans[1][1]==999){
        //     System.out.println("Exception");
        // }
        // else{
            for(int i=0;i<ans.length;i++)
        System.out.println(Arrays.toString(ans[i]));
        // }
    }

    // ----- Assingments --------
}
