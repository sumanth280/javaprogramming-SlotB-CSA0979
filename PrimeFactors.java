import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        List<Integer> primeFactors = new ArrayList<>();

        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }

        while (n % 3 == 0) {
            primeFactors.add(3);
            n /= 3;
        }

        while (n % 5 == 0) {
            primeFactors.add(5);
            n /= 5;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N= ");
        int n = scanner.nextInt();

        boolean isUgly = isUgly(n);
        
        System.out.println("Output: " + isUgly);

        if (isUgly) {
            System.out.println("Explanation: " + n + " has only prime factors limited to 2, 3, and 5.");
        } else {
            System.out.println("Explanation: " + n + " has prime factors other than 2, 3, and 5.");
        }
    }
}
