package Task5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
	
	
	 void printme()
	{
		System.out.println("Hi");
	}
	
		Connection get_Connection(String user,String password) throws ClassNotFoundException, SQLException  {
	

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/Hospital",user,password);  
					return con;
		
		

}
	
}



