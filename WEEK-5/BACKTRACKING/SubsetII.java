//https://leetcode.com/problems/subsets-ii/description/
import java.util.*;
public class SubsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
  
        backtrack(res, new ArrayList<>(),nums,0);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> temp,int[] nums,int start){
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
