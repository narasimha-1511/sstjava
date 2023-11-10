class Solution {
    public int trap(int[] height) {
        int waterTrapped=0;
        int count=0;
        int watertrapped=0;
        int ans[] = TrappedWater(height,0,height.length);
        waterTrapped=ans[0];
        count=ans[1];
        if(count>0){
        ans=TrappedWaterInReverse(height,height.length-1,height.length-count-1);
        watertrapped=ans[0];
        }

        return waterTrapped+watertrapped;
    }
    public int[] TrappedWater(int height[],int start,int end){
        int firstP=height[start];
        int count=0;
        int waterTrapped=0;
        int BlockedWater=0;
        for(int i=start+1;i<end;i++){
        if(firstP>height[i]){
            BlockedWater+=height[i];
            count++;
        }else{
            waterTrapped+=Math.min(firstP,height[i])*count-BlockedWater;
            count=0;
            BlockedWater=0;
            firstP=height[i];
        }
        }
        return new int[]{waterTrapped,count};
    }
    public int[] TrappedWaterInReverse(int height[],int start,int end){
        int firstP=height[start];
        int count=0;
        int waterTrapped=0;
        int BlockedWater=0;
        for(int i=start-1;i>=end;i--){
        if(firstP>height[i]){
            BlockedWater+=height[i];
            count++;
        }else{
            waterTrapped+=Math.min(firstP,height[i])*count-BlockedWater;
            count=0;
            BlockedWater=0;
            firstP=height[i];
        }
        }
        return new int[]{waterTrapped,count};
    }
}