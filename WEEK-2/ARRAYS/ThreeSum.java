import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                     int sum = nums[i]+nums[left]+nums[right];
                    if(sum==0){
                        list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                            while(left<right && nums[left]==nums[left+1])left++;
                            while(left<right && nums[right]==nums[right-1])right--;
                            left++;
                            right--;

            }
            else if(sum<0) left++;
            else right--;
        }}
        return list;
    }
}
/*
 * Problem: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 * example: Input: nums = [-1,0,1,2,-1,-4]
 *         Output: [[-1,-1,2],[-1,0,1]]
 *     Explanation: Because the sum of the triplets is zero.
 * github commit message using implement a Three Sum problem
 */
