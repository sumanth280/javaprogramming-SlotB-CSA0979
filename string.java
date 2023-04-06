import java.util.*;
import java.io.*;
public class string
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String str1=sc.nextLine();
        System.out.println("Enter Second string");
        String str2=sc.nextLine();
        System.out.println("Enter a charecter for index operation :");
        char ch=sc.next().charAt(0);
        System.out.println("Index of"+ch+"in str1 :"+str1.indexOf(ch));
        if(str1.equals(str2))
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
        String str3=str1.concat(" ").concat(str2);
        System.out.println(str3);
    }
}
        
