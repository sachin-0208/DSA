import java.util.*;
class FindAllAnagram{
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(p.length()>s.length()) return list;
        int[] pc = new int[26];
        int[] sc = new int[26];
        for(char c:p.toCharArray()){
            pc[c-'a']++;
        }
        int left=0,right=0;
        while(right<s.length()){
            sc[s.charAt(right)-'a']++;
            if(right-left+1>p.length()){
                sc[s.charAt(left)-'a']--;
                left++;
            }
            if(Arrays.equals(pc,sc)) list.add(left);
            right++;
        }
        return list;
    }
}

/*
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

 

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 */