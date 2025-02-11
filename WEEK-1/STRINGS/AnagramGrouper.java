import java.util.*;

class AnagramGrouper {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            
            anagramMap.putIfAbsent(sortedWord, new ArrayList<>());
            anagramMap.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        AnagramGrouper ag = new AnagramGrouper();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        List<List<String>> result = ag.groupAnagrams(strs);
        System.out.println(result);
    }
}
