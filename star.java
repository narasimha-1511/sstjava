import java.util.*;
public class j1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        /**
         * 3
     *
    ***
   *****
************
 **********
  ********
  ********
 **********
************
   *****
    ***
     *
      
      
      
     *      *
    ***              // here you can see the four parts divided 
   *****

************      // this is trapezium part 
 **********
  ********

  ********
 **********
************

   *****
    ***            // this is the triangle part (Inverse)
     *
         */

        //this is a star pattern 
        // this program is divided into four sections
        

 int N = in.nextInt();

               int i=0,j=0,k=0,z=0;
                
                int a=0,b=0,c=0,d=0;


                // this is the first part of the program
                // printing the first triangle in a star with spaces

                for(i=1;i<=N;i++){
                        //if u observe the start the triangle gets (N+(N-1)) SPACES every time 
                    for(j=N+(N-i);j>=1;j--){
                        System.out.print(" ");
                    }
                    // if you check the patter stars get printed in N rows with increasing of 2 stars every time
                   for(z=((1+(i-1)*2));z>0;z--){
                        System.out.print("*");
                   }
                    System.out.println();// this creates a new line after printitng each row till n rows

                }
                   
                 
                c=(4*N-1); // this is the no of charecters need to be printed in the trapizeum part including spaces and stars
                     

                   for(a=0;a<N;a++){

                      b=(4*N-2*a-1); // this calculates the no of stars to be printed in the trapezium part 

                     for(d=c-b-a;d>0;d--)// this loops prints the no of spaces (c-b gives the difference between ((total charecter)-stars)-a ) 
                     System.out.print(" ");

                      for(b=b;b>=0;b--)      // the no of stars to be printed are calculated above by b
                      System.out.print("*");

                      System.out.println();// this creates a new line after printitng each row till n rows

                   }



                   for(a=N-1;a>=0;a--){    // this is just an inversion of the above trapezium part

                      b=(4*N-2*a-1);

                     for(d=c-b-a;d>0;d--)
                     System.out.print(" ");

                      for(b=b;b>=0;b--)
                      System.out.print("*");

                      System.out.println();

                   }

               

               for(i=N;i>=1;i--){     //This is just an inversion of the first triangle part

                    for(j=N+(N-i);j>=1;j--)
                        System.out.print(" ");

                   for(z=(((i-1)*2)+1);z>0;z--)
                        System.out.print("*");
                   
                    System.out.println();
                }

         }
        }
        