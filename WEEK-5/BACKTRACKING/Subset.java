//https://leetcode.com/problems/subsets/description/
import java.util.*;
public class Subset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        
        backtrack(res,new ArrayList<>(),nums,0);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> temp,int[] nums,int start){
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {
        Subset s = new Subset();
        int[] nums = {1,2,3};
        List<List<Integer>> result = s.subsets(nums);
        System.out.println(result);
    }
}
