import java.io.*;
import java.util.*;
class Box
{
	double width,height,depth;
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	double volume()
	{
		return(width*height*depth);
	}
}
class Boxdemo
{
	public static void main(String[] args)
	{
		Box box1=new Box(10.2,20.3,30.2);
		System.out.println("volume of box is"+box1.volume());
	}
}
