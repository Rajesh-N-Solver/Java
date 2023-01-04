package Task4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String user = "Rajesh";
		String password = "rajesh17";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingsystem",user,password);  
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from users");
		if(rs.next())
		{int i=1;
			System.out.println(rs.getInt(i++));
			System.out.println(rs.getString(i++));
			System.out.println(rs.getString(i++));
			System.out.println(rs.getString(i++));
		}
	}

}
