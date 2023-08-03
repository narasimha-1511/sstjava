import java.util.*;
public class j1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);


        /**
         * 5
**********
****  ****
***    ***
**      **
*        *
         */
        
        // {
        //   int N= in.nextInt();
        //   int i=0,j=0,k=0;
        //   for(i=N;i>=1;i--){

        //         for(j=i;j>=1;j--)
        //         System.out.print("*");
        //         for(k=N-i;k>0;k--){
        //              System.out.print(" ");
        //              System.out.print(" ");
        //         }
                
        //         for(j=i;j>=1;j--)
        //         System.out.print("*");

        //         System.out.println();
    //}

        //   }

       
       /**
        * 5
*        *
**      **
***    ***
****  ****
**********
        */
        // {
        //      int N= in.nextInt();
        //   int i=0,j=0,k=0;
        //   for(i=1;i<=N;i++){

        //         for(j=1;j<=i;j++)
        //         System.out.print("*");
        //         for(k=N-i;k>0;k--){
        //              System.out.print(" ");
        //              System.out.print(" ");
        //         }
                
        //         for(j=1;j<=i;j++)
        //         System.out.print("*");

        //         System.out.println();
        // }

        // }
        
/**  ex  10
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
 */
        // {
        //      int n= in.nextInt();
        //      int N = n/2;
        //   int i=0,j=0,k=0;
        //   for(i=N;i>=1;i--){

        //         for(j=i;j>=1;j--)
        //         System.out.print("* ");
        //         for(k=N-i;k>0;k--){
        //              System.out.print("  ");
        //              System.out.print("  ");
        //         }
                
        //         for(j=i;j>=1;j--)
        //         System.out.print("* ");

        //         System.out.println();

        //                        }

        //             for(i=1;i<=N;i++){

        //         for(j=1;j<=i;j++)
        //         System.out.print("* ");
        //         for(k=N-i;k>0;k--){
        //              System.out.print("  ");
        //              System.out.print("  ");
        //         }
                
        //         for(j=1;j<=i;j++)
        //         System.out.print("* ");

        //         System.out.println();
        //                               }

        // }
  


  /**
   * 4
       *
      ***
     *****
    *******
****************
 **************
  ************
   **********
   **********
  ************
 **************
****************
    *******
     *****
      ***
       *
   * 
   */
         {

                int N = in.nextInt();
               int i=0,j=0,k=0,z=0;
                
                int a=0,b=0,c=0,d=0;
                c=(4*N-1);

                for(i=1;i<=N;i++){
                    for(j=N+(N-i);j>=1;j--){
                        System.out.print(" ");
                    }
                   for(z=(((i-1)*2)+1);z>0;z--){
                        System.out.print("*");
                   }
                    System.out.println();
                }
                   

                   for(a=0;a<N;a++){
                      b=(4*N-2*a-1);
                     for(d=c-b-a;d>0;d--)
                     System.out.print(" ");
                      for(b=b;b>=0;b--)
                      System.out.print("*");
                      System.out.println();
                   }



                   for(a=N-1;a>=0;a--){
                      b=(4*N-2*a-1);
                     for(d=c-b-a;d>0;d--)
                     System.out.print(" ");
                      for(b=b;b>=0;b--)
                      System.out.print("*");
                      System.out.println();
                   }

               

               for(i=N;i>=1;i--){
                    for(j=N+(N-i);j>=1;j--){
                        System.out.print(" ");
                    }
                   for(z=(((i-1)*2)+1);z>0;z--){
                        System.out.print("*");
                   }
                    System.out.println();
                }

         }
        
    }
                
}
