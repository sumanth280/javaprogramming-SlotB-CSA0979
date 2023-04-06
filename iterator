import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("C", "A", "E", "B", "D", "F"));

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.add("+");
        }

        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous());
        }
    }
}
 
