import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] c1 = new int[26];
        int[] c2= new int[26];
        for(char c:s1.toCharArray()){
            c1[c-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            c2[s2.charAt(i)-'a']++;
            if(i>=s1.length()){
                c2[s2.charAt(i-s1.length())-'a']--;
            }
            if(Arrays.equals(c1,c2)) return true;
        }
        return false;
    }
}

/*
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 
 */