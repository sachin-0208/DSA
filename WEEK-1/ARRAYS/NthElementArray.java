class NthElementArray {
    public static String nthElementArray(int n) {
        String[] chr = new String[n];
        chr[0] = "3";
        chr[1] = "4";
        int count = 2;
        int index = 0;

        while (count < n) {
            chr[count++] = chr[index] + "3";
            if (count < n) {
                chr[count++] = chr[index] + "4";
            }
            index++;
        }

        return chr[n - 1];
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(nthElementArray(n));
    }
}
