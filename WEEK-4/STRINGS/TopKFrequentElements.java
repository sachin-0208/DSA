import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int n: nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        @SuppressWarnings("unchecked")
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int key:hm.keySet()){
            int freq = hm.get(key);
            if(bucket[freq]==null){
                bucket[freq]= new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] arr = new int[k];
        int index= 0;
        for(int i=nums.length;i>=0 && index<k;i--){
            if(bucket[i]!=null){
                for(int num: bucket[i]){
                    arr[index++]=num;
                    if(index==k) return arr;
                }
            }
        }
        return arr;
    }
}

/*
 * 
 * 347. Top K Frequent Elements
Solved
Medium
Topics
Companies
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
 

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.


 */