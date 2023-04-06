import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Character to be printed: ");
        char ch = input.next().charAt(0);
        System.out.print("Max Number of time printed: ");
        int n = input.nextInt();
        input.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
