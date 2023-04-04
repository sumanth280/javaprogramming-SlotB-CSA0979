import java.io.*;
import java.util.*;
class great3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a value");
        a=sc.nextInt();
        System.out.println("Enter b value");
        b=sc.nextInt();
        System.out.println("Enter c value");
        c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            { 
            System.out.println("a is greater number");
            }
        }
        else
        {
            if(b>c)
            { 
                System.out.println("b is greater number");
            }
            else
            {
                System.out.println("c is greater number");
            }
        }
    }
}
