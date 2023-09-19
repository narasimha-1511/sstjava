import java.util.*;
public class aug9{

    // Today we are learning about arrays 1D ...
   public static int SumOfElements(int a[]){
    int size = a.length;
     int sum=0;
      for(int i=0;i<size;i++){
        sum+=a[i];
      }
      return sum;
   }

   public static boolean SearchingaNumberinArray(int a[],int target){
     int size = a.length;
     boolean output = false;
     for(int i=0;i<size;i++){
      if(a[i]==target){
        output =  true;
        break;
      }
      }
      return output;
   }

    public static int FreaquencyaNumberinArray(int a[],int target){
     int size = a.length;
     int freaquency = 0;
     for(int i=0;i<size;i++){
      if(a[i]==target){ 
        freaquency ++;
      }
      }
      return freaquency;
   }


    public static double averageContestMarksoftenpersons(int a[]){
      // return (a+b+c+d+e+f+g+h+i+j)/10.0;
         double sum= SumOfElements(a);
      
      return sum/10.0;
    } 

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        //How to create an array we can create in ethier ways as shown below
        int[] a = new int[10];
      int b[] = new int[10];
      // This condition to get length of an array *****************
      int size = a.length;
      // System.out.println(args[1]);

      // scanning the 10 variables into the loop
      System.out.println("Enter 10 values for the array ");
      for(int index=0;index<size;index++){
        a[index] = in.nextInt();
      }

      //Enter the the target Value needed to be found in the array
      System.out.println("Enter the the target Value needed to be found in the array");
      int target = in.nextInt();
        
      // sending the data to the function
      // double average = averageContestMarksoftenpersons(a);
      

      //printing the average
      // System.out.println(average);

      //Searching an Element in a given array with a function
      System.out.println(SearchingaNumberinArray(a,target));
   
      System.out.println(FreaquencyaNumberinArray(a,target));
      
      
      


    
      
    }
}