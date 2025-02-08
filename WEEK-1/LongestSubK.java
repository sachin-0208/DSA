import java.util.*;

class LongestSubK {
    static int longestSubarrayWithSumK(int[] a, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxlen = 0;
        int prefixSum=0;
        hm.put(0,-1);
        for(int i=0;i<a.length;i++){
            prefixSum+=a[i];
            if(hm.containsKey(prefixSum-k)){
                maxlen = Math.max(maxlen,i-hm.get(prefixSum-k)); 
            }
            hm.putIfAbsent(prefixSum,i);
        }
        return maxlen;
        
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 5, 2, 3};
        int k = 3;
        System.out.print(longestSubarrayWithSumK(arr, k));
    }
}

/* notes for myself -
- hm.put(0, -1);Handles cases where prefix sum itself is k
- i - hm.get(prefixSum - k); Gets max subarray length
- hm.putIfAbsent(prefixSum, i); Stores first occurrence to ensure longest subarray
*/