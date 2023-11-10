import java.util.*;
public class aug17{
        
       static int countpairs(ArrayList<Integer> A, int B){//---> iterations  are (N(N-1)/2) ==> N^2
        int pairs=0;int iterations=0;
       for(int i=0;i<A.size();i++){

           for(int j=i+1;j<A.size();j++){

               if(A.get(i)+A.get(j) == B ){  
                 pairs++;
                 
               }
               iterations++;
           }
       }
       return pairs;
       }

       static int countpairsincomplicatedmethod(ArrayList<Integer> A, int B){//---> iterations  are (N(N-1)/2) ==> N^2
        int pairs=0;
       for(int i=0;i<A.size();i++){
         
           for(int j=A.size()-1;j>=0;j--){

               if(A.get(i)+A.get(j) == B ){  
                 pairs++;
                 
               }
               
           }
       }
       return iterations;
       }

    public static void main(String args[]){

    ArrayList<Integer> n = new ArrayList<>();
    for(int i=1;i<=1;i++){
        n.add(i);
    }

        System.out.println(countpairs(n,9));
    
    }
}
