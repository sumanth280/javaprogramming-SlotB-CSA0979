import java.io.*;
import java.util.*;
class Account 
{
  double balance;
  Account()
  {
    balance = 0;
  }
  Account(double sum)
  { 
   balance = sum; 
  }
  double add(double sum)
  {
    balance += sum;
    return sum; 
   }
  double withdraw(double sum)
  {
    if (sum > balance) { 
      balance -= 5;
      return -5;
    }
    else { 
      this.balance -= sum;
      return balance; // Notice: always >= 0 (never < 0)
    }
  }
  double inquire() 
  {
    return balance; 
  } 
    double interest (double rate)
  {
    return rate * balance;   
  }	
}
class bank1
{
	public static void main(String args[])
	{
           try
           {
                Scanner s=new Scanner(System.in);
		
                System.out.println("Enter account holder name:");
                String s1=s.next();
                System.out.println("Enter account type:");
                String s2=s.next();
		int b=0;
                System.out.println("Enter the initial value");
		
		b=s.nextInt();
		Account A;
		if (b==0){
			A = new Account();
		}
		else{
			A = new Account(b);
		}
		
		System.out.println("Enter the amount to withdraw");
		b=s.nextInt();
                
		double d = A.withdraw(b);
                System.out.println("Account holder name:"+s1);
                System.out.println("Account type:"+s2);
		if (d == -5) {
			System.out.println("Penaly RS. -5 is charged since insufficient balance");
			System.out.println("Currrent balance" + A.inquire());
		}
		else{
		System.out.println("Now balance after withdraw of"+ A.inquire() + "is" + d);
		}
		System.out.println("Interest for current balance" + A.inquire() + " is " + 
			A.interest(0.006));
	   }
           catch(Exception e)
           {
               System.out.println("Due to character exception");
           }
}
}
