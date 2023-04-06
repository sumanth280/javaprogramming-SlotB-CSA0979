import java.util.Scanner;

public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        int a = input.nextInt();
        System.out.print("B: ");
        int b = input.nextInt();
        System.out.print("Composite Numbers between " + a + " and " + b + " are: ");

        for (int i = a + 1; i <= b; i++) {
            boolean isComposite = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (isComposite)
                System.out.print(i + " ");
        }
    }
}
