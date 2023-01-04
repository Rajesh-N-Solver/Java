package Task5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*; 
public class JDBCTest {
	int a=5;
	static int b =6;
	 static void call()
	{
		JDBCTest test1 = new JDBCTest();
		DBConnection db = new DBConnection();
		db.printme();
		
		System.out.println(test1.a);
		System.out.println(b);
	}
 
public static void main(String args[]){  
try{  
//Class.forName("com.mysql.cj.jdbc.Driver");  
////Connection con=DriverManager.getConnection(  
////"jdbc:mysql://localhost:3306/Test","Rajesh","rajesh17");  
//DBConnection db = new DBConnection();
////Statement st = db.get_Connection("Rajesh","rajesh17").createStatement();
//Connection con = db.get_Connection("Rajesh","rajesh17");
//Statement  st = con.createStatement();
//System.out.println("Established");
//st.executeUpdate("insert into students(name,email) values('Rajesh','rajesh@gmail.com')");
//System.out.println("Added");
//con.close(); 
	DBConnection db = new DBConnection();
	JDBCTest test = new JDBCTest();
	test.call();
}catch(Exception e){ System.out.println(e);}  


}  
} 
