import java.util.HashMap;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        if(s.equals(t)) return s;
        
    
        HashMap<Character, Integer> hmt = new HashMap<>();
        HashMap<Character, Integer> hms = new HashMap<>();
        for(char c:t.toCharArray()){
            hmt.put(c,hmt.getOrDefault(c,0)+1);
        }
        String tempp="";
        int left=0,right=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        while(right<s.length()){
            char temp = s.charAt(right);
            if(hmt.containsKey(temp)){
                hms.put(temp,hms.getOrDefault(temp,0)+1);
                if(hms.get(temp) <= hmt.get(temp)){
                    count++;
            }
            }
            
            while(count==t.length()){ 
                if(min>right-left+1) {
                min = Math.min(min,right-left+1);
                tempp=s.substring(left,right+1);
                }
                char t1 = s.charAt(left);
                if(hmt.containsKey(t1)){
                    if(hmt.get(t1).equals(hms.get(t1))){
                        count--;
                    }
                    hms.put(t1,hms.get(t1)-1);
                }

            left++;
            }
            right++;
        }
        return tempp;
    }
}
 /*
  * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

 

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
 

Constraints:

m == s.length
n == t.length
1 <= m, n <= 105
s and t consist of uppercase and lowercase English letters.
 

Follow up: Could you find an algorithm that runs in O(m + n) time?
  */