import java.util.Scanner;

public class VoteEligibility {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String ageStr = input.nextLine();

        int age;

        try {
            age = Integer.parseInt(ageStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            input.close();
            return;
        }

        if (age < 0) {
            System.out.println("Invalid input");
        } else if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("You are not eligible to vote");
            System.out.println("You are allowed to vote after " + yearsLeft + " years");
        }

        input.close();
    }
}
