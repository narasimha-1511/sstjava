package Random_Questions;

public class painters_partition {
    public static int paint(int painters,int time_for_each,int arr[]){

        int max= Integer.MIN_VALUE,sum=0,min=Integer.MAX_VALUE;
        for(int elem: arr){
            sum+=elem;
            if(max<elem)max=elem;
            if(min>elem)min=elem;
        }
        //Here We find the Minimum Time can be taken to do is the max*cost_for_Each
        //max time taken will me the complete work is done by a single worker sum*cost_for_each

        int s=min,e=sum;

        //If its possible to get the p
        // split the given sub array into number of painters with max sum;

        int max_sum=Integer.MIN_VALUE;

        int original_max=0;

        while(s<e){

            System.out.println("Start : "+s+" End : "+e);
            int m = s+(e-s)/2;

            int temp_sum=0;
            int no_of_subarrays=0;
            for(int i=0;i<arr.length;i++){
                temp_sum+=arr[i];

                if(temp_sum>=m){
                    System.out.println("ffff" +temp_sum+"  m:" + m);
                    if(max_sum<temp_sum){
                        max_sum=temp_sum;
                         System.out.println("Max Sum Updatred :  "+max_sum);
                    }
                    temp_sum=0;
                    no_of_subarrays++;
                }
               
            }
            System.out.println(no_of_subarrays);
            if(no_of_subarrays>=painters){
                s=m+1;
                original_max=max_sum;
            }
            else{
                e=m-1;
                System.out.println("making ti zeroooo");
                max_sum=0;
            }


        }

        

        return original_max*time_for_each;
    }

    public static void main(String[] args) {
        System.out.println(paint(3, 10, new int[]{185,186,938,558,655,461,441,234,902,681}));
    }
}
