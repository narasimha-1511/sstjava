import java.util.Arrays;

public class aug31 {
    //We Can Create data That Can Widely Usen in Entire Class
    int row;int col;
    



    // Sort A Given String
    public static String SortString(String s) {
        // String SortedString = "";

        char ans[] = new char[s.length()];// ---> Larger Iterations NlogN
        // SortedString += s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            ans[i] = s.charAt(i);
        }
        Arrays.sort(ans);

        return new String(ans);

        // for(int i=0;i<s.length();i++){ -->> This IS Not Working But Almost Done
        // char temp=s.charAt(i);
        // for(int j=i+1;j<s.length();j++){
        // if(temp>s.charAt(j)){
        // temp = s.charAt(j);
        // }
        // }
        // // s=s.substring(0, );
        // SortedString+=temp;
        // }

        // int a[] = new int[26];
        // for(int i=0;i<s.length();i++){
        // a[(int)s.charAt(i)-(int)'a']++;
        // }
        // for(int i=0;i<a.length;i++){ // Minimum Iterations --->2N (But Larger Memory)
        // if(a[i]!=0){
        // for(int j=0;j<a[i];j++){
        // SortedString+=(char)((int)'a'+i);
        // }
        // }
        // }

        // return SortedString;
    }

    public static int[] SearchForTarget(int[][] mat, int target) {
        int ans[] = { -1, -1 };
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] == target) {
                        ans[1] = j;
                        ans[0] = i;
                        break;
                    }
                }
            }
        return ans;
    }

    public static String ReturnLongStringWithFreaqueny(){
        return "hi";
    }

    public static void main(String[] args) {
        String test = "abcjhedfu";
        System.out.println(SortString(test));
        // Home Work String Builder
        int arr[][] = { 
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int ans[]=SearchForTarget(arr, 7);
        System.out.println("Position is ["+ans[0]+","+ans[1]+"]");


        aug31 hey = new aug31();
        hey.row=10;
        hey.col=20;

    }
}
