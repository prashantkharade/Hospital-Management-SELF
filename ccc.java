
import java.sql.*;
import java.util.Scanner;

public class ccc {
public static void main(String arg[]) throws Exception {
	
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter Your id :  ");
		String id = sc.next();
		
		System.out.print("Enter Your name :  ");
		String name = sc.next();
		
		
		System.out.print("Enter Your age :  ");
		String age = sc.next();
		
		System.out.print("Enter Your password :  ");
		String password = sc.next();
		
		System.out.print("Enter Your password again to confirm:  ");
		String cpassword = sc.next();
	
		
		if(password.equals(cpassword)) {
			
			try {
				
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Ppk@3721");
			
			String q5="insert into InsertDemo(id,name,age) values(?,?,?)";
			
			
			
			PreparedStatement st5 = con.prepareStatement(q5);
			
			
			
			st5.setString(1, id);
			
			st5.setString(2, name);
			
			st5.setString(3, age);
		
			
		
			
			
			
			
			
			
			st5.executeUpdate();
			
			
			
			System.out.println("Registration successful.");
			
			con.close();
			}
			
			catch(Exception e)
			{
				System.out.println(e+"I am catch");
			}
			
			//login.login1();

		}
	}

	
}

}