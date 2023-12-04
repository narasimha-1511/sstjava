import java.util.*;

public class aug7{
    static int Additon(int a, int b){
        return a+b;
    }
    static int Product(int a, int b){
        return a*b;
    }
    static int Subract(int a, int b){
        return a-b;
    }
    static void pi(int a){
        System.out.println(a);
    }
    static int perfectsquare(int a){
        int z=0;
        for(int i=1;i*i<=a;i++){
            if(i*i==a){
               z=i;
               break;
                      }
        }
                    return z;
      
    }
    public static void main(String args[]){     
    //  System.out.println(Additon(5,6));
    Scanner in = new Scanner(System.in);
    {
    int perfectsquarenum = in.nextInt();
      System.out.println(perfectsquare(perfectsquarenum));
    }   
    
    }
}