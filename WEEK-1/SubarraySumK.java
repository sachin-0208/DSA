import java.util.*;

class SubarraySumK{
    static int subarraySumK(int[] a,int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int prefixSum=0;
        int count = 0;
        hm.put(0,1);
        for(int i=0;i<a.length;i++){
            prefixSum+=a[i];
            if(hm.containsKey(prefixSum - k)){
                count += hm.get(prefixSum-k);
            }
            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
        }
        return count;

    }
    public static void main(String[] args){
        int[] arr = {1,4,3,1,2,4};
        int k = 3 ;
        System.out.print(subarraySumK(arr,k));
    }
}

/*
 Notes for myself - 
- `hm.put(0,1);` → Handles cases where prefixSum is directly `k`.  
- Always use `hm.getOrDefault(prefixSum, 0)` with hashmap name.  
- Update frequency in `hm`, not `count` directly.  
- `prefixSum - k` ensures continuous subarray check.
*/