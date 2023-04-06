import java.io.*;
import java.util.*;
class year
{
    public static void main(String[] args)
    {
    try{
    int d,y,w,y1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the days :");
    int nod=sc.nextInt();
    if(nod<=0)
    {
        throw new ArithmeticException("Invalid due to zero/negative value");
    }
    y=nod/365;
    y1=nod%365;
    w=y1/7;
    d=y1%7;
    System.out.println("Years :"+y);
    System.out.println("Weeks :"+w);
    System.out.println("Days  :"+d);
    }
    catch(ArithmeticException e)
    {
    System.out.println(e.getMessage());
    }
    catch(Exception e)
    {
    System.out.println("Invalid Due to error");
    }
    }
}
