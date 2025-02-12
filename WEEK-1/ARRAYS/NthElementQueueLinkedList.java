import java.util.LinkedList;
import java.util.Queue;

class NthElementQueueLinkedList {
    public static String findNthElement(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("3");
        queue.add("4");
        
        String result = "";
        for (int i = 0; i < n; i++) {
            result = queue.poll();
            queue.add(result + "3");
            queue.add(result + "4");
        }
        
        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(findNthElement(n)); // Output: "44"
    }
}
