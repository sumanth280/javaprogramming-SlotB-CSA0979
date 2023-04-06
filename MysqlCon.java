import java.io.*;
import java.sql.*;

class MysqlCon {
    public static void main(String args[])
	{  
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/student","root","magesh");  
			//here db is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from stud");  
			while(rs.next())  
			System.out.println(rs.getString(1));
			con.close();  
		}
		catch(Exception e){ System.out.println(e);}
    }
}