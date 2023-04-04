import java.io.*;
import java.util.*;
class great
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter a value");
        a=sc.nextInt();
        System.out.println("Enter b value");
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greater number");
        }
        else
        {
            System.out.println("b is greater number");
        }
    }
}
