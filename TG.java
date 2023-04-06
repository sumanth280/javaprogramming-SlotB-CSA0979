import java.io.*;
import java.util.*;
class TwoGenerics<T>
{
    T a;
    T b;
    TwoGenerics(T a1,T b1){
    a=a1;
    b=b1;
    }
    void swap()
    {
        T c=a;
        a=b;
        b=c;
    }
    void print(){
    System.out.println(a);
    System.out.println(b);
    }}
    class GDemo
    {
    public static void main(String args[])
    {
    TwoGenerics<String>obj=new TwoGenerics<String>("Vishnu","Vardhan");
    System.out.println("Before Swapping");
    obj.print();
    System.out.println("After Swapping");
    obj.swap();
    obj.print();
    }
}
