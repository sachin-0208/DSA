// https://leetcode.com/problems/combination-sum-ii/description/
import java.util.*;
public class CombinationII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res,new ArrayList<>(),candidates,target,0);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> temp,int[] cand,int target,int start){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<cand.length;i++){
            if(i>start && cand[i]==cand[i-1]) continue;
            if(cand[i]>target) break;
            temp.add(cand[i]);
            backtrack(res,temp,cand,target-cand[i],i+1);
            temp.remove(temp.size()-1);
        }
    }
}
