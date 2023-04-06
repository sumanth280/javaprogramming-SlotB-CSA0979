import java.util.Scanner;

public class SquaresOfSquaresPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        int square = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(square * square + "  ");
                square++;
            }
            System.out.println();
        }
    }
}
