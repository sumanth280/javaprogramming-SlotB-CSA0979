import java.io.*;
import java.util.*;
public class lastw {
public static void main(String[] args){
        int len = 0;
        String x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        x=sc.nextLine();
        String a= x.trim();
 
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }
        System.out.println("The length of last word is "
                           + len);        
   
        
        
        
    }
}
