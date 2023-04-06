import java.io.*;
import java.util.*;
class composite
{
	public static void main(String args[])
	{
		int a[]={16,18,27,16,23,21,19};
		int c=0;
		for(int i=0;i<7;i++)
		{
			if(a[i]%2==0)
			{
				c++;
			}
			else if(a[i]%3==0)
			{
				c++;
			}
		}
		System.out.println("compocite number:"+c);
	}
}