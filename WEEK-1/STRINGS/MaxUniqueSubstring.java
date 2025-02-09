import java.util.HashSet;

class MaxUniqueSubstring {
    static int maxUniqueSubstring(String s) {
        int n = s.length();
        if (n <= 0) return -1;

        HashSet<Character> hs = new HashSet<>();
        int start = 0;
        int maxLen = 0;

        hs.add(s.charAt(0));

        for (int end = 1; end < n; end++) {
            while (hs.contains(s.charAt(end))) {
                hs.remove(s.charAt(start));
                start++;
            }

            hs.add(s.charAt(end));
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Length of the longest substring without repeating characters: " + maxUniqueSubstring(input));
    }
}
