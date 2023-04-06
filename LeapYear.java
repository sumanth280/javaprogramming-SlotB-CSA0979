import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Date (in dd/mm/yyyy format): ");
        String date = input.nextLine();
        int year = Integer.parseInt(date.substring(6));
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Given year is Leap Year");
        } else {
            System.out.println("Given year is Non Leap Year");
        }
    }
}
