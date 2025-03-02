public class MaximumSumSubarray {
    public static int maxSum(int[] arr) {
        int ls = arr[0];
        int cs = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cs = Math.max(arr[i], arr[i] + cs);
            ls = Math.max(cs, ls);
        }
        return ls;
    }

    public static void main(String[] args) {
        int[] testArray1 = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        int[] testArray2 = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] testArray3 = {-1, -2, -3, -4, -5};

        System.out.println("Test 1: " + MaximumSumSubarray.maxSum(testArray1)); // Expected output: 9
        System.out.println("Test 2: " + MaximumSumSubarray.maxSum(testArray2)); // Expected output: 7
        System.out.println("Test 3: " + MaximumSumSubarray.maxSum(testArray3)); // Expected output: -1
    }
}
/*
Problem: Given an array of integers, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */