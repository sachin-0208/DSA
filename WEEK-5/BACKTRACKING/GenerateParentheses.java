// Leetcode Problem: https://leetcode.com/problems/generate-parentheses/description/
import java.util.*;
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res,new StringBuilder(),n,0,0);
        return res;
    }
    public void backtrack(List<String> res,StringBuilder strbuild,int n,int open,int close){
        if(strbuild.length()==2*n){
            res.add(strbuild.toString());
            return;
        }
        if(open<n){
            strbuild.append("(");
            backtrack(res,strbuild,n,open+1,close);
            strbuild.deleteCharAt(strbuild.length()-1);
        }
        if(close<open){
            strbuild.append(")");
            backtrack(res,strbuild,n,open,close+1);
            strbuild.deleteCharAt(strbuild.length()-1);
        }
    }
}
