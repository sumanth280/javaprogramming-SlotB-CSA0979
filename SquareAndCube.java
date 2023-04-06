import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double num = input.nextDouble();

        double square = num * num;
        double cube = num * num * num;

        System.out.println("Square of " + num + " is: " + square);
        System.out.println("Cube of " + num + " is: " + cube);
    }
}
