import java.util.*;
public class nov10 {
    public static void main(String[] args) {
        // System.out.println(FloorOfRootN(10));
    Scanner in = new Scanner(System.in);

    // System.out.println(gcd(2,3));

    System.out.println(NthMagicalNumber(14,10,12));
    }

    public static int FloorOfRootN(int N){
        int s=1,e=N,ans=-1;

        while(s<e){
            int m = s+ (e-s)/2;
            if(m*(long)m>N){
                e=m-1;
            }
            else{
                s=m+1;
                ans=m;
            }
        }
        
        return ans;
    }

    public static int NoOfStepsCanbeFormed(int N){
        int s=1,e=N,ans=-1;

        while(s<=e){

            int m = s+(e-s)/2;

            long stepsNeeded = m*((long)(m+1))/2;

            if(stepsNeeded>N){
                e=m-1;
            }else{
                ans=m;
                s=m+1;
            }

        }

        return ans;
    }

    
    public static int NthMagicalNumber(int n,int a ,int b){

        long s=a,e=n*a;

        if(b<a){
            s=b;
            e=n*b;
        }
        long ans=-1;

        while(s<=e){
            long m = s +(e-s)/2;
            long pos = m/a + m/b - m/(a*b/gcd(a,b));
            System.out.println(m+" "+pos);
            if(pos>=n){
                ans=m;
                e=m-1;
            }else{
                s=m+1;
            }
        }

        return (int)ans;
    }

    public static int gcd(int n1, int n2)
    {
        if (n2 == 0)
        return n1;
        else
        return gcd(n2, n1 % n2);
    }


}
