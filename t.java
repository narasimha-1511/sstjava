import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner in =new Scanner(System.in);
        int x =in.nextInt();
        int zz=1;
        int n = x;
        int i =0,ld=0,sum=0;
        for(zz=1;zz<=x;zz++){
        // int a =in.nextInt();
        
        // int b =in.nextInt();
        x=zz;
        for(i=1;i<=10;i++){
            ld=x%10;
            x=x/10;
            
            sum+= Math.pow(ld,3);
            if(x==0)break;
        }
        if(sum==zz)
        System.out.println(zz);
        sum=0;
        
        }
    }
}