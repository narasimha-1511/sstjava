import java.util.Scanner;
public class aug16{


    //Write a function  rotate the array k times
    static int[] rotatigArrayDidnotSolve(int n[], int k){ //Did'nt solve -->> Use Right Shift Of array to Solve aathis Problem

           int rotation=k;
           int temp=0;
  
        // for(int i=n.length-rotation;i<n.length;i++){

        //     for(int j=0;j<n.length;j++){
        //         if(i==n.length)break; ----->> Try to Solve This Approch When Free
        //      temp = n[j];
        //      n[j] = n[i];
        //       n[i]=temp;
        //       i++;
        //     }

      return n;
        

        }
       
    
        
     
    

  public static int[] rigthshiftanarray(int n[]){
    int temp = n[n.length-1];
    for(int i=n.length-1;i>0;i--){
        n[i]=n[i-1];  // Error Index Out Of Bound
    }
    n[0]=temp;
    return n;
  }

  static int[] insert(int array[], int input, int ElementsPresent){ // USing Oops -- >> "HAhaha"
      if(ElementsPresent==array.length){
        int ab[] = new int[array.length+1];
        ab[array.length]=input;
        return ab;
      }else{
        int ab[] = new int[array.length*2];
        array[ElementsPresent+1]=input;
        for(int i=0;i<array.length;i++)
        ab[i]=array[i];
        return ab;
      }


  }
 


    public static void main(String args[]){
        // Learning About CGR-----> Continous Grade Rating
        /**
         * Assingments 20%
         * Quzzes 5%
         * Contests/Exams 75%
         * Viva
         * 
         * Project(Evaluation)
         */
          

          Scanner in = new Scanner(System.in);


           //-->> Right Shift And Rotation Of an Array..
    //     {  
    //    int rotatingarrayarray[] ={1,2,3,4,5,6,7,8,9};

    //     rotatingarrayarray = rigthshiftanarray(rotatingarrayarray);

    //    for(int i=0;i<rotatingarrayarray.length;i++){
    //     System.out.print(rotatingarrayarray[i]+" ");
    //    }
    //    }
       

       //Inputing The Elements AS User Givess On the Input
      //  {
      //    int[] A = new int[10];
      //    int elemno=0;
      //    for(int i=0;i>=0;i++){
      //       int input = in.nextInt();
      //       elemno++;
      //       A = insert(A,input,elemno);
      //    }
      //  }

       //So Here IS arraylist Introduction
       {
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i>=0;i++){
            int input = in.nextInt();
            A.add(input);
         }
       }


    }
}
