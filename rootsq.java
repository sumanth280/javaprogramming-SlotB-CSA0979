import java.util.Scanner;
class rootsq
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0)
        {
            if(n==0)
            {
                System.out.println("Zero doesn't have any square root value");
            }
            else
            {
                System.out.println("Due to negative value ");
            }
        }

        else
        {
            double x = Math.sqrt(n);   
            System.out.println("square root is: " +x);
            System.out.println("The Rounded number is: "+Math.round(x));
        }
    }
}
