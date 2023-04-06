import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); 
            }
            for (int k = 0; k <= i; k++) {
                System.out.printf("%4d", num); 
                num = num * (i - k) / (k + 1);
            }
            System.out.println(); 
        }
    }
}
