import java.io.*;
class Base
{
	int i;
	Base(int a)
	{
		i=a;
	}
	void print()
	{
		System.out.println("Super class instance variable :"+i);
	}
}
class derived extends Base
{
	int i,j;
	derived(int a,int b,int c)
	{
		super(a);
		i=b;
		j=c;
	}
	void print()
	{
		System.out.println("Super class instance variable :");
		System.out.println(super.i);
		super.print();
		System.out.println("Sub class instance variable:");
		System.out.println(i);
		System.out.println(j);
	}
}
class superdemo
{
	public static void main(String arg[])
	{
		derived d=new derived(10,20,30);
		d.print();
	}
}
