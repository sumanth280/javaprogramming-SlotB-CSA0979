import java.util.Scanner;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); 
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); 
                if (k != i) {
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }
}
