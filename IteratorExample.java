import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");

        ListIterator<String> iter = list.listIterator();
        while (iter.hasNext()) {
            String elem = iter.next();
            iter.set(elem + "+");
        }

        iter = list.listIterator(list.size());
        while (iter.hasPrevious()) {
            System.out.print(iter.previous());
        }
    }
}
