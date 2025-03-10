public class TrappedRainWater {
    public int trappedRainWater(int[] height){
        if(height==null || height.length==0 ) return 0;
        int left=0,lmax=0,rmax=0,right=height.length-1,water=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(lmax<height[left]){
                    lmax = height[left];
                }
                else{
                    water+=lmax-height[left];
                }
                left++;
            }
            else{
                if(rmax<height[right]){
                    rmax = height[right];
                }
                else{
                    water+=rmax-height[right];
                }
                right--;
            }
        }
        return water;
    }
    
}
