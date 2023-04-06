import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a perfect square number: ");
        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);
        if (sqrt == (int) sqrt) {
            System.out.println("The square root of " + num + " is " + (int) sqrt);
        } else {
            System.out.println(num + " is not a perfect square number.");
        }
        sc.close();
    }
}
