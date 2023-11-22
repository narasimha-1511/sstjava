package trimister2.BitManipulation;

import java.util.Arrays;

public class nov22 {

    public static int toogle(int N,int bit){

        boolean setornot = ((N>>bit)&1)==1;
        // System.out.println(setornot);

        if(setornot){
            return (N^(1<<bit));
        }else{
            return (N|(1<<bit));
        }

        // The simple Approach For the problem is return "N^(1<<bit)"
    }

    public static int[] twoUniqueElements(int arr[]){
        //for forst unique elem and second elem
        int first=-1,second=-1;

        int xor=0;

        for(int elem: arr){
            xor^=elem;
        }

        int getsetpos=0;//here get the position of the set bit

        while((xor&1)!=1){
            xor=xor>>1;
            getsetpos++;
        }

        int xorFirst=0;

        //now we only xor with those elements
        for(int elem:arr){
            if(((elem>>getsetpos)&1)==1){
                xorFirst = xorFirst^elem;
            }
        }

        first=xorFirst;

        for(int elem:arr){
            xorFirst= xorFirst^elem;
        }

        second=xorFirst;

        return new int[]{first,second};

        //Approach
        //First Xor the completet array
        //now get the xor ex = 10101
        //now the 1 at the 0th position implies that the two elements has different bits over there
        //partition the array based on bits 
        // now we can assue two array with one unique element each
    }

    public static int uniqueElementAmongThreeDuplicates(int arr[]){
        //no changes in array , space complexity must be O(1);;

        //Approach write down the complete binary numbers of the ecomplete array
        //ex array [6,5,9,5,9,9,5]
        /*
         0 1 1 0
         0 0 1 1
         1 0 0 1
         0 0 1 1
         1 0 0 1
         1 0 0 1
         0 0 1 1


         count of set bits at every position ==> count
         now if count is multiple of 3 , then there is no set bit at the unique number
         if count is (3x + 1) , there is a set bit at the postion of the unique number...
         */

        return -1;
    }

    
    public static void main(String[] args) {
        System.out.println(toogle(10, 1));

        // Scanner in = new Scanner(System.in);

        System.out.println(11&5&7&9);

              System.out.println(11^5^7^9);

        System.out.println(Arrays.toString(twoUniqueElements(new int[]{3,6,4,4,6,8})));

        // while(){
        //     int a = in.nextInt();
        //     int b = in.nextInt();
        //     System.out.println(a^b);
        //     System.out.println(a&b);
        // }
    }
}
