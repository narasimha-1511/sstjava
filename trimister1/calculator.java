import java.util.*;
import java.io.*;
public class calculator{

    public static double add(int a, int b){
        return a+b;
    }

    public static double sub(int a, int b){
        return a-b;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static double sub(double a, double b){
        return a-b;
    }

    public static double mul(int a, int b){
        return a*b;
    }

    public static double mul(double a, double b){
        return a*b;
    }

    public static double div(int a, int b){
        return a/b;
    }

    public static double div(double a, double b){
        return a/b;
    }

    // public static double pow(int a, int b){
    //     return Math.pow(a,b);
    // }

    public static double pow(double a, double b){
        return Math.pow(a,b);
    }

    // convert base (int num , int base) => assuming thr number is base 10 , convert it into new base

    public static double convertbase(double num, double base){
        int numcheck=(int)num;
        int basenum = (int)base;
        int remainder=0;
        int covertednumber=0;
        while(numcheck!=0){
          remainder = numcheck % basenum; 
          numcheck = numcheck / basenum; 
          covertednumber = *10 +remainder;

        }
        return covertednumber;
    }


    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int rerun=0;
      while(rerun!=1){
      System.out.println("Enter the first number ");
      double number1 = in.nextInt();
      System.out.println("Enter the operation  \n for base change type b");
      char operation = in.next().charAt(0);
      System.out.println("Enter the Second number ");
      double number2 = in.nextInt();
       
     double ans=0;

      switch(operation){
        case '+':
         ans = add(number1,number2);
         break;
        case '-':
         ans = sub(number1,number2);
         break;
        case '/':
         ans = div(number1,number2);
         break;
        case '*':
        ans = mul(number1,number2);
         break;
        case '^':
        ans = pow(number1,number2);
         break;
         case 'b':
        ans = convertbase(number1,number2);
        default:
         System.out.println("Wrong Operation Enter Again");

      }

      if(ans!=0){
      System.out.println(ans);
        rerun=1;}

      

}

    }
}