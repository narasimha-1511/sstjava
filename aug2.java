import java.util.*;
public class j1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);


                   // here we are just printing the stars in rows and colums as nXn
        //   {
        //     int N = in.nextInt();

        //     int i=0,j=0;

        //     for(i=1;i<=N;i++){
        //         for(j=1;j<=N;j++){
        //         System.out.print("*");
        //         } 
        //     System.out.println();
        //     }
        // }



               // PrinTING  A RECTANGLE PATTERN OF M*N
        // {
        //     int N = in.nextInt();
        //     int M = in.nextInt();
        //     int i=0,j=0,k=0;

        //     for(i=1;i<=M;i++){
        //         if(i==1||i==M){
        //         for(j=1;j<=N;j++){
                    
        //         System.out.print("*");
        //         } }
        //         else{
        //             System.out.print("*");
        //             for(k=1;k<=N-2;k++)
        //             System.out.print(" ");
        //             System.out.print("*");
        //         }
        //     System.out.println();
        //     }
        // }


           //  printing a patter example
           // N=3
           // *
           // **
           // ***
        // {
        //     int N = in.nextInt();

        //     int i=0,j=0;

        //     for(i=1;i<=N;i++){
        //         for(j=1;j<=i;j++){
        //         System.out.print("*");
        //         } 
        //     System.out.println();
        //     }
        // }

           /**
            * This is for printing the pattern ex
            * N=4
            * aaaa
            * aaa
            * aa
            * a 
            */
        // {
        //     int N = in.nextInt();

        //     int i=0,j=0;

        //     for(i=N;i>=1;i--){
        //         for(j=1;j<=i;j++){
        //         System.out.print("*");
        //         } 
        //     System.out.println();
        //     }
        // }

                 


                 // example pattern for this is 
                 /**
                  if n=6;
                  
                    * 2
                    * 2 *
                    * 2 * 4
                    * 2 * 4 *
                    * 2 * 4 * 6 

                  */
        // {
        //        int N = in.nextInt();

        //     int i=0,j=0;

        //     for(i=1;i<=N;i++){
        //         for(j=1;j<=i;j++){
        //             if(j%2==0){
        //                 System.out.print(j+" ");
        //             }else{
        //         System.out.print("* ");
        //             }
        //         } 
        //     System.out.println();
        //     }  
        // }

            //Hey boi thisi is  a different patternthat is given below
            /**
                    1 * 
                    1 * 2 
                    1 * 2 * 
                    1 * 2 * 3 
                    1 * 2 * 3 * 
                    1 * 2 * 3 * 4 
                    1 * 2 * 3 * 4 * 
                    1 * 2 * 3 * 4 * 5 
                    1 * 2 * 3 * 4 * 5 *
             * 
             */
        // {
        //        int N = in.nextInt();

        //     int i=0,j=0,k=1;// here i and j are for loop and k is for printing the charecters

        //     for(i=1;i<=N;i++){
        //         k=1;
        //         for(j=1;j<=i;j++){
        //             if(j%2==1){
        //                 System.out.print(k+" ");
        //                 k++;
        //             }else{
        //         System.out.print("* ");
        //             }
        //         }   
        //     System.out.println();
        //     }  
        // }

             // for patter is simple 

             /**
                for num = 5;; here spacing between them must between the first and last charecter and line contains 
                *   *
                *   *
                *   *
                *   *
                *   *
              */

        // {
        //     int z =  in.nextInt();
        //     int k=0,i=0;
        //     for(i=1;i<=z;i++){
        //             System.out.print("*");
        //              for(k=1;k<=z-2;k++)
        //             System.out.print(" ");
        //             System.out.print("*");
        //             System.out.println();
        //     }

        // }

           // 


           /**
            * 4
                    *   *
                    *  *
                    * *
                    **
            */
            //   {
            //       int N = in.nextInt();

            // int i=0,k=0;

            // for(i=N;i>=1;i--){             
            //         System.out.print("*");
            //         for(k=i-1;k>=1;k--)
            //         System.out.print(" ");
            //         System.out.print("*");
            // System.out.println();
            // }
            //   }

              //patterrnnn examle is below

              /**
               * 6
     *
    **
   ***
  ****
 *****
******
               */
            {
                  int N = in.nextInt();

            int i=0,j=0,k=0;

            for(i=1;i<=N;i++){             
                    for(k=N-i;k>=1;k--)
                    System.out.print(" ");
                    for(j=i;j>=1;j--)
                    System.out.print("*");
            System.out.println();
            }
              }
    }
}