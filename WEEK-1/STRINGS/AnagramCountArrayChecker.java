public class AnagramCountArrayChecker {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String temp1 = s1.toLowerCase();
        String temp2 = s2.toLowerCase();
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[temp1.charAt(i) - 'a']++;
            count[temp2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}