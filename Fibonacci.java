import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N= ");
        int n = scanner.nextInt();
        
        int fibonacciNumber = fib(n);
        
        System.out.println("Output: " + fibonacciNumber);
        System.out.println("Explanation: F(" + n + ") = F(" + (n-1) + ") + F(" + (n-2) + ") = " + fib(n-1) + " + " + fib(n-2) + " = " + fibonacciNumber + ".");
    }
}
