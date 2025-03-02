import java.util.Arrays;

public class MaxProductSubarrayWithIndices {
    
        public static int[] maxProductSubArray(int[] nums){
            int maxp,result;
            int minp=maxp=result=nums[0];
            int start=0;
            int end=0;
            int tempstart=0;
            for (int i = 1; i < nums.length; i++) {
                if(nums[i]<0){
                    int temp=maxp;
                    maxp=minp;
                    minp=temp;
                }
                if(nums[i]>nums[i]*maxp){
                    maxp = nums[i];
                    tempstart=i;
                }
                else{
                    maxp *= nums[i];
                }
                minp=Math.min(nums[i],nums[i]*minp);
                if(maxp>result){
                    result=maxp;
                    start=tempstart;
                    end=i;
                }
            }
            return Arrays.copyOfRange(nums,start,end+1);
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int[] result = maxProductSubArray(nums);
        System.out.println("Max product subarray: " + Arrays.toString(result));
    }
}
/*
 * Problem: Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
 */