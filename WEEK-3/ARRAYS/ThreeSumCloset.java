import java.util.Arrays;

public class ThreeSumCloset {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int md  = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<n-2;i++){
            int low = i+1,high=n-1;
            while(low<high){
                int temp = nums[i]+nums[low]+nums[high];
                if(Math.abs(target-temp)<md){
                    ans = temp;
                    md = Math.abs(target-temp);
                }
                if(temp==target) return target;
                else if(temp>target) high--;
                else{
                    low++;
                }
            }

        }
        return ans;
    }
}

/*
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 

Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
 */
