import java.io.*;
class base
{
	int i;
	base(int a)
	{
		i=a;
	}
	void print()
	{
		System.out.println("super class instance variable:"+i);
	}
}
class derived extends base
{
	int i;
	int j;
	derived(int a,int b,int c)
	{
		super(a);
		i=b;
		j=c;
	}
	void print()
	{
		System.out.println("super class instance variable");
		System.out.println(super.i);
		super.print();
		System.out.println("sub class instance variable");
		System.out.println(i);
		System.out.println(j);
	}
}
class superdemo
{
	public static void main(String[] args)
	{
		derived d=new derived(10,20,30);
		d.print();
	}
}