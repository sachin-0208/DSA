class PalindromeChecker{
    static boolean palindromeChecker(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(palindromeChecker("madam"));
        System.out.println(palindromeChecker("hello"));
    }
}
