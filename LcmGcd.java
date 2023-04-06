import java.util.Scanner;

public class LcmGcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N value: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        int lcm = findLcm(numbers);
        System.out.println("LCM = " + lcm);
        int gcd = findGcd(numbers);
        System.out.println("GCD = " + gcd);
        input.close();
    }
    public static int findLcm(int[] numbers) {
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = lcm * numbers[i] / findGcd(lcm, numbers[i]);
        }
        return lcm;
    }
    public static int findGcd(int[] numbers) {
        int gcd = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            gcd = findGcd(gcd, numbers[i]);
        }
        return gcd;
    }
    public static int findGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGcd(b, a % b);
        }
    }
}
