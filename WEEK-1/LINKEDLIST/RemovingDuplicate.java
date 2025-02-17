import java.util.LinkedList;
import java.util.Iterator;

public class RemovingDuplicate {

    public static void removeDuplicates(LinkedList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return;
        }

        Iterator<Integer> iterator = list.iterator();
        Integer previous = null;
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (previous != null && current.equals(previous)) {
                iterator.remove();
            } else {
                previous = current;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        System.out.println("Original List: " + list);
        removeDuplicates(list);
        System.out.println("List after removing duplicates: " + list);
    }
}
