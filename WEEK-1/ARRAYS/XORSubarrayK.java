import java.util.HashMap;

class XORSubarrayK{
    static int xorSubarrayK(int[] a,int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int xor = 0;
        int count = 0;
        hm.put(0,1);
        for(int i=0;i<a.length;i++){
            xor^=a[i];
            if(hm.containsKey(xor^k)){
                count+=hm.get(xor^k);
            }
            hm.put(xor,hm.getOrDefault(xor,0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1,4,3,1,2,4};
        int k = 3 ;
        System.out.print(xorSubarrayK(arr,k));
    }
}

/* key takeaways for myself -
Used Prefix XOR instead of Prefix Sum 
Formula: xor ^ k instead of xor - k (because XOR works differently) 
HashMap stores frequency of XORs to efficiently count valid subarrays 
Time Complexity: O(n) (Single pass + HashMap lookups) 
 */