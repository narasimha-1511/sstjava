import java.util.ArrayList;

public class sep15 {

    public static ArrayList<Integer> findQuerySum(int arr[], int queries[][]){//Normal Method
        ArrayList<Integer> ans = new ArrayList<>();
        for(int[] elemarr: queries){
            //range in query is[L,R]
            //elemarr[0]-->is L
            //elemarr[1]--> id R
            int sum=0;
            for(int i=elemarr[0];i<=elemarr[1];i++){
                sum+=arr[i];
            }
            ans.add(sum);
        }
        return ans;
    }

    public static ArrayList<Integer> findQuerySumOptimized(int arr[], int queries[][]){
        ArrayList<Integer> ans = new ArrayList<>();
        int prefixSumArray[] = new int[arr.length];
        int sum=0;
        //Preparing the Sub array,,,
        for(int i=0;i<arr.length;i++){
            int elem=arr[i];
            sum+=elem;
            prefixSumArray[i]=sum;
        }
        //Iterating Over the queries
        for(int[] elemarr: queries){
            //range in query is[L,R]
            //elemarr[0]-->is L
            //elemarr[1]--> id R
            int L = elemarr[0];
            int R = elemarr[1];
            if(L!=0)
            ans.add(prefixSumArray[R]    -prefixSumArray[L-1]);
            else
            ans.add(prefixSumArray[R]);
        }
        return ans;
    }

     public static ArrayList<Integer> findQueryEvenOptimized(int arr[], int queries[][]){
        ArrayList<Integer> ans = new ArrayList<>();
        int prefixSumArray[] = new int[arr.length];//
        int even=0;
        //Preparing the Sub array,,,
        for(int i=0;i<arr.length;i++){
            int elem=arr[i];
            if(elem%2==0){
                even++;
            }
            prefixSumArray[i]=even;
        }
        //Iterating Over the queries
        for(int[] elemarr: queries){
            //range in query is[L,R]
            //elemarr[0]-->is L
            //elemarr[1]--> id R
            int L = elemarr[0];
            int R = elemarr[1];
            if(L!=0)
            ans.add(prefixSumArray[R]    -prefixSumArray[L-1]);
            else
            ans.add(prefixSumArray[R]);
        }
        return ans;
    }

    //Count of Equillibrium Indexes in an Array
    public static ArrayList<Integer> findEquillibriumIndexes(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();

        int rtsum=0;
        //complete sum=rtsum
        for(int i=0;i<arr.length;i++){
          rtsum+=arr[i];      
        }
        int ltsum=0;
        for(int i=0;i<arr.length;i++){
            rtsum-=arr[i];
          if(ltsum==rtsum){
            ans.add(i);
          }
          ltsum+=arr[i];
        }

        return ans;
    }


    public static void main(String[] args) {
        int A[] = {2,3,5,1,3,5,6,9};
        int[][] queries ={{1,5},{3,4},{5,5},{4,6},{0,4},{7,7}};
        System.out.println(findQuerySum(A, queries));
        System.out.println(findQuerySumOptimized(A, queries));
        System.out.println(findQueryEvenOptimized(A, queries));

        int arr[] ={1,2,3,5,1,5};
        System.out.println(findEquillibriumIndexes(arr));
    }
}
