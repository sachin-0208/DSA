import java.util.LinkedList;
import java.util.Iterator;

public class ReversingLinkedList {

    public static void reverse(LinkedList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return;
        }

        Iterator<Integer> iterator = list.iterator();
        LinkedList<Integer> reversedList = new LinkedList<>();
        while (iterator.hasNext()) {
            reversedList.addFirst(iterator.next());
        }

        list.clear();
        list.addAll(reversedList);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List: " + list);
        reverse(list);
        System.out.println("Reversed List: " + list);
    }
}
