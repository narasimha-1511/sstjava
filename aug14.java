public class aug14{
      

      // THis Function returs the first and last indexes of the array
      // first i have done it in two loops 
      //then optimized the code in one loop  --> n iterations
      // Pervious
     static void FirstLastwithTwoLoops(int n[] , int target){
        
        for(int i =0;i<n.length;i++){
            if(target==n[i])
            {
               System.out.println(i);
            break;
            }
        }
    
        for(int i =((n.length)-1);i>=0;i--){
            if(target==n[i])
            {
                System.out.println(i);
            break;
            }
        }
    }


    static void FirstLastSingleLoop(int n[],int target){
        int z=0;
        int initialindex=0;
        for(int i =0;i<n.length;i++){
            if(target==n[i])
            {
               if(z==0){
                initialindex=i;
                z=1;
                }else{
                    z=i;
                }
            }
        }
        if(initialindex!=0)
         System.out.println(initialindex+" \n"+z);
    }

    /* Single number!!
    [2,4,5,2,1,1,5]    
    */
    //every number in the loop is twice repeated find the Single Number Present in The Array
    static int SingleNumberFamousProblemSolution(int n[]){
        int breaktheloop=1;
        for(int j=0;j<n.length;j++){

            breaktheloop=1;// We will be Using This variable to Break The outer Loop..
            int target =n[j]; // This takes the Intial Value as Target Value
            int k=j+1;
            

            //Here Loop Runs from zeroo 
            for(int i =0;i<n.length;i++){
            if(target==n[i] && i!=j) // Here Dual Condiiton Is One the Targer Itself  and Other is The Number Shouldnt check with the Same Index(Number)
            {
                breaktheloop=0; // If the Number Is Present SO This Variable Doesnt not Break the OuterLoop
               break;
            }

           }
           //If The Number Is'nt Present Then It is the Single Number So Return The Number
           if(breaktheloop==1){
            return n[j];
           }
        
        }
        return 0;

    }

    //Count number of elements for which there exits atleast one element which is greter than them
     static int CountofElementsAtleasToneGreaterInNonOptimized(int n[]){//N^2 --> Iterations
        int count=0;
        for(int j=0;j<n.length;j++){

            int target =n[j]; // This takes the Intial Value as Target Value
            
            //The Loop Starts With The Next Index Number of The Target abd then Checks For it
            for(int i =0;i<n.length;i++){
            if(target<n[i])
            {
               count++;
               break;
            }
           }
         
        
        }
        return count;

    }

    // In Optimized Solution Of Finding "The Count Of Elements At Least One Greater Than Them" => {
        // We Use Different Method Of Approach -->>  We Find The Greatest Number In the Array and Check Its Freaquency And Subract 
        //                                            The Freaquecy Of the Greatest Number From The Length Of The Array
    
    static int CountofElementsAtleasToneGreaterInOptimized(int n[]){  //N --> Iterations
        int freaquencyofgreatestnumber=0;
        int maxvalue=n[0]; // Assuming The Maximumn Value To Be the First Index OF Array

        for(int j=1;j<n.length;j++){

            if(maxvalue<n[j]){ // Checking If the Maximum Value Greater Than every Number
              maxvalue=n[j];  
              freaquencyofgreatestnumber=1;
            }
            else if(maxvalue==n[j]){// If there Exists a Same Number of The Maximum Then Count Its
                freaquencyofgreatestnumber++;
            }
        }
        
        int count = n.length - freaquencyofgreatestnumber;

        return (count);

    }


    public static void main(String args[]){
        // studied about errors formed in the arrays
        //index out of bound
        // index get started from the count of zero
        // arr.length function returns the length of the function it starts counting from zero

        

    int array[] = {1,3,4,4,5,6,7,8,8,8,8,8,8,9,9,10,10};
    FirstLastwithTwoLoops(array,11);

    int SingleNumberFamousPProblemarray[] = {2,4,6,9,6,4,5,2,1,1,5};
    // System.out.println(SingleNumberFamousProblemSolution(SingleNumberFamousPProblemarray));

    int CountatleastonegreaterelementsArray[] = {5,6,5,4,5,8,56,56,56,56,56,5,6,5,5,5,9,5,8,4,5,6};
    System.out.println(CountofElementsAtleasToneGreaterInOptimized(CountatleastonegreaterelementsArray));
    System.out.println(CountofElementsAtleasToneGreaterInNonOptimized(CountatleastonegreaterelementsArray));

    }
}