import java.util.*;
public class aug1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        // {
        //     System.out.println("Enter the nuber for which you need trailling zeros factorial ");

        //     int N=in.nextInt();
        //     int i =5,z=0,tz=0;;
        //     while(N/i>0){
        //     tz=tz+ N/i;
        //     i=i*5;
        //     }
        //     System.out.println(tz);
        // }


                     // This is the prime factorization of a number 
        {
             int N=in.nextInt();
             int x=N,z=0;
             int i=0;
             for(i=2;i*i<=N;i++){      
                  z=i;
                while(x%z==0){
                     System.out.print(z+"*");
                     x=x/z;
                }
                if(x==1)break;

             }System.out.print("1");
             if(x==1){}else{
                System.out.println("*"+x);
             }
        }
        in.close();
    
    
    
    
    }
}
