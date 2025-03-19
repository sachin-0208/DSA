//https://leetcode.com/problems/combinations/description/
import java.util.*;
public class Combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),n,1,k);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> temp,int n,int start,int k){
        if(temp.size()==k){
         res.add(new ArrayList<>(temp));
         return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            backtrack(res,temp,n,i+1,k);
            temp.remove(temp.size()-1);
        }
    }
}
