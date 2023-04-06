import java.util.*;
class ExDemo
{
	public static void main(String args[])
	{
		int a[]={5,10};
		int b=5,y;
		try
		{
			int x=a[2]/(a[1]-b);
			System.out.println(x);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bounds exception occured");			
			//System.out.println(e.getMessage());
		}
	}
}