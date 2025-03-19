//https://leetcode.com/problems/palindrome-partitioning/description/
import java.util.*;
public class PalindromicPartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),s,0);
        return res;   
    }
    public void backtrack(List<List<String>> res,List<String> temp,String s,int start){
        if(start==s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                temp.add(s.substring(start,end+1));
                backtrack(res,temp,s,end+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }

}
