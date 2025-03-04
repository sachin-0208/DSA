import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int left = j+1;
                int right = n-1;
                while(left<right){
                     long sum =(long) nums[i]+nums[j]+nums[left]+nums[right];
                     if(sum==target){
                           list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                          while(left<right && nums[left]==nums[left+1]) left++;
                          while(left<right && nums[right]==nums[right-1]) right--;
                          left++;
                          right--;
                 }
                    else if(sum<target){
                       left++;
                 }
                     else right--;
                 }
            }
        }
        return list;
    }
}
/*
 * Problem: Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 * Notice that the solution set must not contain duplicate quadruplets.
 * example: Input: nums = [1,0,-1,0,-2,2], target = 0
 *        Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 *   Explanation: Because the sum of the quadruplets is zero.
 * 
 */
 
