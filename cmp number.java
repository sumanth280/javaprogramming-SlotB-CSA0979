import java.io.*;
import java.util.*;
class cmp
{
	public static void main(String arg[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a<b)
		{
			System.out.println("Second number is greater");
		}
		else
		{
			System.out.println("First number is greater");
		}
	}
}