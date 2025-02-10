public class TwoPointerPalindromeChecker {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            right--;
            left++;
        }
        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("Enter a string: ");
            String testString = scanner.nextLine();
        
            if (isPalindrome(testString)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
}
