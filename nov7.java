public class nov7 {
    public static int FindLeastIndexOfElement(int arr[],int target){
        int s=0,e=arr.length-1;

        while(s<e){
            int mid = (s+e)/2;

            if(arr[mid]>=target){
                e = mid;
            }else{
                s=mid+1;
            }
        }

        return s;
    }

    public static int FindLargestIndexOfElement(int arr[],int target){
        int s=0,e=arr.length-1;

        while(s<e){
            int mid = (s+e)/2;

            System.out.println(arr[mid]+" " +mid);

            if(arr[mid]==target){
                if(arr[mid]==arr[mid+1]){
                    s=mid+1;
                }else{
                    return mid;
                }
            }else if(arr[mid]<target){
                s = mid+1;
            }
            else{
                e=mid-1;
            }
        }

        return s;
    }

    public static int FindUniqueInteger(int arr[]){
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid = (e+s)/2;
           
            if(mid%2==0){
                if(arr[mid]==arr[mid+1]){
                    s=mid+2;
                }else if(arr[mid]==arr[mid-1]){
                    e=mid-2;
                }else{
                    return mid;
                }
            }else{
                 if(arr[mid]==arr[mid-1]){
                    s=mid+2;
                }else if(arr[mid]==arr[mid+1]){
                    e=mid-1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int ans = FindUniqueInteger(new int[]{-5,-5,0,0,1,1,2,2,-3,8,8});
        System.out.println(ans);
    }
}
