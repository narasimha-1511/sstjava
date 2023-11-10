import java.lang.*;
import java.util.*;

public class t {

    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
            int ansIterator = 0;
            for (int i = 0; i < A.size(); i++) {
                boolean added = false;
                for (int j = i + 1; j < A.size(); j++) {
                    if (isAnagrams(A.get(i), A.get(j))) {
                        if (!added) {
                            ans.add(new ArrayList<Integer>());
                            ans.get(ansIterator).add(i + 1);
                            ans.get(ansIterator).add(j + 1);
                            added = true;
                        } else {
                            ans.get(ansIterator).add(j + 1);
                        }
                    }
                }
                if (added) {
                    ansIterator++;
                }
            }

            return ans;
        }

        public boolean isAnagrams(String a, String b) {
            HashMap<Character, Integer> B = new HashMap<>();
            for (char elem : b.toCharArray()) {
                if (!B.containsKey(elem))
                    B.put(elem, 1);
                else {
                    int f = B.get(elem);
                    B.put(elem, f + 1);
                }
            }
            for (char elem : a.toCharArray()) {
                if (!B.containsKey(elem)) {
                    return false;
                } else {
                    if (B.get(elem) == 0) {
                        return false;
                    } else {
                        int f = B.get(elem);
                        B.put(elem, f - 1);
                    }

                }
            }
            return true;
        }
    }

    public static void test(int A[]) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], i);
            if (max < A[i]) {
                max = A[i];
            }
            if (min > A[i]) {
                min = A[i];
            }
        }

        // return map.get(max)-map.get(min);
    }

    public static int PickfromBothSides(int[] A, int B) {

        // Preparing the Prefix Array
        int prefix[] = new int[A.length];
        prefix[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < B; i++) {

            int FirstSum = prefix[B - 1 - i];

            int LastSum = prefix[A.length - 1] - prefix[A.length - 1 - i];

            System.out.println(FirstSum + " " + LastSum);
            if (max < FirstSum + LastSum) {
                max = LastSum + FirstSum;
            }
        }
        // One Last Case is Reamaining -
        int lastCase = Integer.MIN_VALUE;
        if (B != A.length)
            lastCase = (int) prefix[A.length - 1] - (int) prefix[A.length - B - 1];
        System.out.println(lastCase);
        if (max < lastCase) {
            return lastCase;
        }
        return max;
    }

    public static int colorFulNum(int A) {
        // First getting Digitis
        int digits = 0;
        int temp = A;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        int tempdigits = digits;

        int colorArr[] = new int[((digits) * (digits + 1)) / 2];
        int zz = 0;
        for (int j = 0; j < tempdigits; j++) {
            // Inner Loop for getting the 3,32,324
            for (int i = digits - 1; i >= 0; i--) {
                colorArr[zz] = (A / ((int) Math.pow(10, i)));
                zz++;
            }
            A -= (A / (int) Math.pow(10, tempdigits - 1 - j)) * ((int) Math.pow(10, tempdigits - j - 1));
            // System.out.println(A);
            digits--;
        }

        //Now We have a Color Array
        //We Should Compare the product of digits
        HashSet<Integer> products = new HashSet<>();
        
        for(int i=0;i<colorArr.length;i++){
            int elem = colorArr[i];
            int prod = getProductOfDigits(elem);
            if(products.contains(prod)){
                return 0;
            }else{
                products.add(prod);
            }
        }
        return 1;
    }

    public static int getProductOfDigits(int a){
        int product=1;
        while(a!=0){
            product*=a%10;
            a/=10;
        }
        return product;
    }

    public static int ClosetMinMax(ArrayList<Integer> A) {

        HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
        int min=Integer.MAX_VALUE,max=0;


        for(int i=0;i<A.size();i++){
            int elem = A.get(i);
            if(min>elem){
            min = elem;
            }
            if(max<elem){
            max=elem;
            }
            if(map.containsKey(elem)){
                ArrayList<Integer> temp = map.get(elem);
                temp.add(i);
                map.put(elem,temp);
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(elem,temp);
            }

        }

        ArrayList<Integer> minIndex = map.get(min);
        ArrayList<Integer> maxIndex = map.get(max);

        int min_length=Integer.MAX_VALUE;
        for(int i=0;i<minIndex.size();i++){
            for(int j=0;j<maxIndex.size();j++){
                int length = (int)Math.abs(minIndex.get(i)-maxIndex.get(j));
                if(min_length>length){
                    min_length=length;
                }
            }
        }

    return min_length+1;
    }

    public static int[] sort(final int[] C, int B) {
        int A[] = new int[C.length];
        for(int i=0;i<C.length;i++)A[i]=C[i];

        int min = Integer.MAX_VALUE;
        int minIn=Integer.MAX_VALUE;

        for (int i=0;i<=B;i++){
            for(int j=i;j<C.length;j++){
                if(min>A[j]){
                    min=A[j];
                    minIn=j;
                }
            }
            int temp = A[i];
            A[i]=A[minIn];
            A[minIn]=temp;
        }

        return A;
    }
    




    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        // Scanner in =new Scanner(System.in);
        // int x =in.nextInt();
        // int zz=1;
        // int n = x;
        // int i =0,ld=0,sum=0;
        // for(zz=1;zz<=x;zz++){
        // // int a =in.nextInt();

        // // int b =in.nextInt();
        // x=zz;
        // for(i=1;i<=10;i++){
        // ld=x%10;
        // x=x/10;

        // sum+= Math.pow(ld,3);
        // if(x==0)break;
        // }
        // if(sum==zz)
        // System.out.println(zz);
        // sum=0;

        // int arr[] = {5, -2, 3 , 1, 2};

        // System.out.println(PickfromBothSides(arr,3));

       // System.out.println(colorFulNum(32467));
       //ArrayList<Integer> hey = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,3,2}));
       //System.out.println(ClosetMinMax(hey));
       
       
    //    int A[]={8,16,80,55,32,8,38,40,65,18,15,45,50,38,54,52,23,74,81,42,28,16,66,35,91,36,44,9,85,58,59,49,75,20,87,60,17,11,39,62,20,17,46,26,81,92};
       
    
    
    // Java code to demonstrate the
// working of substring(int begIndex, int endIndex)

// Driver Class
		// Initializing String
        // int A[] = {10,10,8,3};
        // HashMap<Integer,Integer> map = new HashMap();
        // int sum=0,max=0;
        // for(int i=0;i<A.length;i++){
        //     if(map.containsKey(A[i])){
        //         int freq = map.get(A[i]);
        //         map.put(A[i],++freq);
        //     }else{
        //         map.put(A[i],1);
        //     }
        //     sum+=A[i];
        // }
        // for(Integer key: map.keySet()){
        //     int temp  = (key*map.get(key));
        //     if(max<temp){
        //         max=temp;
        //     }
        // }
        // System.out.println(sum-max);
    
        // int [][]A = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        //     };
        //     int B =2;
        // int j = A[0].length-1,i=0;
        // int ans = -1;

        // while(i<A.length && j>=0){
        //     System.out.println(A[i][j]);
        //     if(A[i][j]==B){
        //         ans = (i+1)*1009+(j+1);
        //     }
        //     else if(B<A[i][j]){
        //         j--;
        //     }else{
        //         i++;
        //     }
        // }
        // System.out.println(ans);
        boolean ans =isReachableAtTime(1, 1, 2, 2, 1);
        System.out.println(ans);

    }
    public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx==fx && sy==fy)return t>=2;
        //Here WE need to find  the shortset path
        int TimeTaken = 0;
        while(sx<fx && sy<fy){
            sx++;
            sy++;
            TimeTaken++;
        }
        while(sx==fx && sy<fy){
            sy++;
            TimeTaken++;
        }
        while(sy==fy && sx<fx){
            sx++;
            TimeTaken++;
        }
        if(TimeTaken<=t){
            return true;
        }
        System.out.println(TimeTaken);
        return false;
    }
}
