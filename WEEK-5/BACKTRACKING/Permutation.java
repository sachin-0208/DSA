import java.util.*;
// https://leetcode.com/problems/permutations/description/
public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),new boolean[nums.length],nums);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> temp,boolean[] used,int[] nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            used[i]=true;
            temp.add(nums[i]);
            backtrack(res,temp,used,nums);
            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }
}
