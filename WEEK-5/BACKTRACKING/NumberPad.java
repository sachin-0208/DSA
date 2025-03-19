// link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
import java.util.*;
public class NumberPad {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        String[] mapping = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i=0;i<mapping.length;i++){
            hm.put(i+2,mapping[i]);
        }
        backtrack(res,new StringBuilder(),digits,hm,0);
        return res;
    }
    public void backtrack(List<String> res,StringBuilder strbuild,String digits,HashMap<Integer,String> hm,int index){
        if(strbuild.length()==digits.length()){
            res.add(strbuild.toString());
            return;
        }
       
            String temp  = hm.getOrDefault(digits.charAt(index)-'2'+2,"");
            if(temp==null) return;
            for(char c:temp.toCharArray()){
                strbuild.append(c);
                backtrack(res,strbuild,digits,hm,index+1);
                strbuild.deleteCharAt(strbuild.length()-1);
            }
        
    }
}
