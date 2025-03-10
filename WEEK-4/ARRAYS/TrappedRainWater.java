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
/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
https://assets.leetcode.com/uploads/2018/10/22/rainwatertrap.png
 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 

Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105
 */