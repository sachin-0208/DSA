import java.util.HashMap;

class AnagramChecker {
    static boolean anagramChecker(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        HashMap<Character, Integer> hs1 = new HashMap<>();
        HashMap<Character, Integer> hs2 = new HashMap<>();
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            hs1.put(s1.charAt(i), hs1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            hs2.put(s2.charAt(i), hs2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        return hs1.equals(hs2);
    }

    public static void main(String[] args) {
        System.out.println(anagramChecker("listen", "silent"));
        System.out.println(anagramChecker("hello", "world"));
    }
}
