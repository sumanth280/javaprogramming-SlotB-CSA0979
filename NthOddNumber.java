import java.util.Scanner;

public class NthOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.print("Enter the value of N: ");
        int N = input.nextInt();

        int count = 0;
        int i = 1;
        while (count < n + N) {
            if (i % 2 != 0) {
                count++;
                if (count > n && count <= n + N) {
                    System.out.println(count - n + ": " + i);
                }
            }
            i++;
        }
    }
}
