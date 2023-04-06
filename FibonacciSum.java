import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int prev = 0, curr = 1, sum = 0;
        while (curr <= n) {
            sum += curr;
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        System.out.println("The sum of the Fibonacci series up to " + n + " is " + sum);
        sc.close();
    }
}
