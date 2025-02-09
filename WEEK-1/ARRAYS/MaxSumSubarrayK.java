import java.util.*;

class MaxSumSubarrayK {
    static int maxSumSubarrayK(int[] a, int k) {
        if(k<=0 || k>a.length) return -1;
        int currentSum=0;
        for(int i=0;i<k;i++){
            currentSum += a[i];
        }
        int maxsum = currentSum;
        for(int end=k;end<a.length;end++){
            currentSum =currentSum + a[end]-a[end-k];
            maxsum = Math.max(maxsum,currentSum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] a = {1,3,6,8,3,5,2,8,5,6};  
        int k = 3; 
        System.out.print(maxSumSubarrayK(a, k));//e/o/p=19
    }
}
