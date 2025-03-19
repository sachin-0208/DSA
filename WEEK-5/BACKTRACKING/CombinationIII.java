
// https://leetcode.com/problems/combination-sum-iii/description/
import java.util.*;

public class CombinationIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums,k,n,0);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> temp,int[] nums,int k,int target,int start){
        if(target==0 && k==0 ){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(res,temp,nums,k-1,target-nums[i],i+1);
            temp.remove(temp.size()-1);
        }
    }
}
