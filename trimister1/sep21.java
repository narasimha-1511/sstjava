public class sep21{
    //Today BitManipulation Bit Manipulation

    public static int SumOfAllSubArrays(int arr[]){

        
        /*
         * [1,2,3]=>
         * Answer is = (1 )+(1,2)+(1,2,3)+(2)+(2,3)+(3) == 20
         */
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int contribution = (arr[i]*(arr.length-i)*(i+1));
            sum+=contribution;
        }
        return sum;
    }

    public static int[] easierGoogle(int arr[],int q[][]){
        return arr;
    }
    public static void main(String[] args) {
        int q[][] = {{},{},{},{},{}};
        System.out.println(easierGoogle(new int[]{0,0,0,0,0,0,0,0},q));
    }
}