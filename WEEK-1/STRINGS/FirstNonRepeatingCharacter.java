import java.util.HashMap;

class FirstNonRepeatingCharacter {
    static int firstNonRepeatingCharacter(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1 = "leetcode";
        String str2 = "loveleetcode";
        String str3 = "aabb";

        System.out.println(firstNonRepeatingCharacter(str1)); 
        System.out.println(firstNonRepeatingCharacter(str2)); 
        System.out.println(firstNonRepeatingCharacter(str3)); 
    }
}
