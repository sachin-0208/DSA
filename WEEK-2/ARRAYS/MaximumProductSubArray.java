public class MaximumProductSubArray {
    public static int maximumProductSubArray(int[] arr){
        int result=arr[0];
        int maxp=arr[0];
        int minp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<0){
                int temp=maxp;
                maxp=minp;
                minp=temp;
            }
            maxp = Math.max(arr[i],arr[i]*maxp);
            minp = Math.min(arr[i],arr[i]*minp);
            result = Math.max(result,maxp);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, -2, 4};
        int[] arr2 = {-2, 0, -1};
        int[] arr3 = {-2, 3, -4};

        System.out.println("Maximum product subarray of arr1: " + maximumProductSubArray(arr1));
        System.out.println("Maximum product subarray of arr2: " + maximumProductSubArray(arr2));
        System.out.println("Maximum product subarray of arr3: " + maximumProductSubArray(arr3));
    }
}

/*
 problem: Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
 */