import java.util.Arrays;

public class MaxSubarrayWithIndices {
    public static int[] maxSum(int[] arr){
        int ls=arr[0],cs=arr[0];
        int start=0;
        int tempstart = 0;
        int end = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>cs+arr[i]){
                cs = arr[i];
                tempstart=i;
            }
            else{
                cs+=arr[i];
            }
            if(cs>ls){
                ls = cs;
                start = tempstart;
                end = i;
            }
        }
        return Arrays.copyOfRange(arr,start,end);
    }
    public static void main(String[] args) {
        int[] testArray1 = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        int[] testArray2 = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] testArray3 = {-1, -2, -3, -4, -5};

        System.out.println("Test 1: " + Arrays.toString(MaxSubarrayWithIndices.maxSum(testArray1))); // Expected output: [3, 6]
        System.out.println("Test 2: " + Arrays.toString(MaxSubarrayWithIndices.maxSum(testArray2))); // Expected output: [2, 6]
        System.out.println("Test 3: " + Arrays.toString(MaxSubarrayWithIndices.maxSum(testArray3))); // Expected output: [0, 0]
    }
}
/*
 problem: Given an array of integers, find the contiguous subarray (containing at least one number) which has the largest sum and return the indices of the subarray.
 */
