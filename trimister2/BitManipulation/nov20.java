package trimister2.BitManipulation;

import java.util.Scanner;

public class nov20 {
    public static void main(String[] args) {

        // Scanner in = new Scanner(System.in);

        // int arr[] = {2,7,3,6,2,2,3,2,7,6,6,7,7,1,1};

        // int ans = 0;

        // for(int elem: arr){
        //     ans = ans^elem;
        // }

        // System.out.println(CheckIfPositionSet(34, 3));   // in.close();

        System.out.println(NumberofSetPos(7));

    }

    public static int NumberofSetPos(int N){
        int sets=0;
        while(N!=0){
            if((N&1)==1){
                sets++;
            }
            N>>=1;
        }
        return sets;
    }

    public static boolean CheckIfPositionSet(int N, int pos){
        return ((N>>pos)&1)==1;
        //First the number in Binary form is Shifted to the rightside as provided 
        //Then check the last digit by doing & with 1;
    }
}
