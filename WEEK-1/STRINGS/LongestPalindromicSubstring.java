public class LongestPalindromicSubstring {
    public static String longestPalindromicSubstring(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int l1 = expandAroundCenter(s, i, i);
            int l2 = expandAroundCenter(s, i, i + 1);
            int maxlen = Math.max(l1, l2);

            if (maxlen > (end - start)) {
                start = i - (maxlen - 1) / 2;
                end = i + (maxlen) / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String input = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindromicSubstring(input));
    }
}
