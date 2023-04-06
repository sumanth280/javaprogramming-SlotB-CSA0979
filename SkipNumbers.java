package exam;
import java.util.Scanner;

public class SkipNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("M: ");
        int M = scanner.nextInt();
        System.out.print("N: ");
        int N = scanner.nextInt();
        System.out.print("K: ");
        int K = scanner.nextInt();

        for (int i = M; i <= N; i += K) {
            System.out.print(i + ", ");
        }
    }
}
