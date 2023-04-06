import java.util.*;

public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names:");
        int n = sc.nextInt();
        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        System.out.println("Enter the order (A/D):");
        String order = sc.next();
        if (order.equalsIgnoreCase("A")) {
            Arrays.sort(names);
        } else if (order.equalsIgnoreCase("D")) {
            Arrays.sort(names, Collections.reverseOrder());
        } else {
            System.out.println("Invalid order!");
            return;
        }
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
