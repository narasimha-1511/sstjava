import java.util.*;
public class j1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
 /*   //for N iterations     
{
     int n = in.nextInt();
      int i=0;
      for (i=1;i<=n;i++) {
        if (n%i==0){
            System.out.print(i+" ");
        }
      }System.out.println();
      
}
*/
      /*   //for N/2 iterations     
{
     int n = in.nextInt();
      int i=0;
      for (i=1;i<=(n/2);i++) {
        if (n%i==0){
            System.out.print(i+" ");
        }
      }System.out.println(n);
      
}
*/



   /* // Printing the factors between [N,M] in N/2 iterations 
      {
        int n = in.nextInt();
        int m = in.nextInt();

      int i=0,j=0;
      for (j=n;j<=m;j++){
           // factors for the current value are getting through this loop
      for (i=1;i<=(j/2);i++) {
        // checking the factors for the value 
        if (j%i==0){
            System.out.print(i+" ");
        }
      }
      System.out.println(j);

      }


      }

      */
        

            // Checking wether a number is prime or not in N/2 iterations
      /*  
    {
        int n = in.nextInt();
      int i=0,count=0;
      for (i=1;i<=n/2;i++) {
        if (n%i==0){
            count++;
        }
      }
      if(count==1){
        System.out.println("Yes its a prime number");
        }else{
        System.out.println("No its a prime number");

        }

    }
        */ 



           // Checking wether prime or not in (Root N) iterations
       {
                   int N = in.nextInt();
                   int i=0,k=0;
                   for(i=2;i*i<=N;i++){
                    if(N%i==0){
                    System.out.println("No its not a prime");
                    k=1;
                    break;
                    }
                   }
                   if(k==0){
                    System.out.println("Yes its  a Prime");
                   }
       }



    }


}