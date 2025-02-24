import java.util.*;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                System.out.println("First Unique Character: " + s.charAt(i));
                return i;
            }
        } 
        return -1;
    }

    public static void main(String[] args) {
        
        String test1 = "leetcode";       
        String test2 = "loveleetcode";   
        String test3 = "aabb";           
        String test4 = "abcabcde";       

        
        System.out.println("Test 1: " + firstUniqChar(test1));
        System.out.println("Test 2: " + firstUniqChar(test2));
        System.out.println("Test 3: " + firstUniqChar(test3));
        System.out.println("Test 4: " + firstUniqChar(test4));
    }
}
