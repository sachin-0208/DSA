class SmallestRotation {
    static String smallestRotation(String s) {
        int n = s.length();
        String sr = s;
        for (int i = 1; i < n; i++) {
            String temp = s.substring(i) + s.substring(0, i);
            if (temp.compareTo(sr) < 0) {
                sr = temp;
            }
        }
        return sr;
    }

    public static void main(String[] args) {
        System.out.println(smallestRotation("dcbaabcd"));  
        System.out.println(smallestRotation("cbabc"));     
        System.out.println(smallestRotation("aaaaa"));     
        System.out.println(smallestRotation("z"));         
    }
}
