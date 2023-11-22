package Random_Questions;

import java.util.Arrays;

public class Special_Integer {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,3,4,5}, 10));
    }

    public static void prefixx(int A[],long prefix[]){
         prefix[0]=A[0];
        //make a prefix array to calculate sum of sub array
        for(int i=1;i<A.length;i++){
            prefix[i] = prefix[i-1] + A[i];
        }
    }

    public static int solve(int[] A, int B) {

        long prefix[] = new long[A.length];
        prefixx(A, prefix);
        System.out.println(Arrays.toString(prefix));

        int s=1,e=A.length;
        int ans=0;

        //here as we defined start  and end the ans will be between these only

        while(s<=e){
            int m = s+(e-s)/2;

            int i=m-1,j=0;
            System.out.println("Here K is : "+m);
            
            if(check(i, j, prefix, B)){
                ans=m;
                s=m+1;
            }else{
                e=m-1;
            }
        }

        return ans;
    }

    public static boolean check(int i,int j,long prefix[],int max_sum){
        while(i<prefix.length && j<prefix.length){
                
                long sum = (j==0) ? prefix[i] : prefix[i] - prefix[j-1]; 
                // System.out.println("sum : "+sum+" Of Subarray : "+i );
                if(sum>max_sum){
                    return false;
                }
                i++;
                j++;
            }
            return true;
    }
}
