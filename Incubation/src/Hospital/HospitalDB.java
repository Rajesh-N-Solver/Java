package Hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class HospitalDB {
	static boolean RegisteredOrNot(String name,long number,Connection connection) throws SQLException
	{
		 String check_query = "select * from PatientRegisteration where Patient_Name=? AND Mobile=?";
		 PreparedStatement pstmt = connection.prepareStatement(check_query);
		 pstmt.setString(1, name);
		 pstmt.setLong(2, number);
		 ResultSet rs = pstmt.executeQuery();
		 if(rs.next())
		 {
			 return true;
		 }
		 return false;
	}
	static void Register(String name,long number,Connection connection) throws SQLException
	{
		 String insert_query = "insert into patientregisteration (Patient_Name,Mobile) values('"+name+"',"+number+")";
		 Statement stmt = connection.createStatement();
		 stmt.executeUpdate(insert_query);
	}
	static void updateStatus(int patientId,Connection connection) throws SQLException
	{
		DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("hh:mm a");
		LocalTime now = LocalTime.now();
		String inTime = myFormatObj1.format(now);
		int doctor = (int) ((Math.random() * (20 - 2)) + 2) ;
		String doctorTime = doctor + " mins";
		String medProf1end;
		String medProf2end;
		String doctorend;
		String pharmend;
		String outTime ;
		int waitTime=0;
		int min_diff=0;
		PreparedStatement
		String need = "select * from availability";
		Statement stmt  = connection.createStatement();
		ResultSet rs = stmt.executeQuery(need);
		if(rs.next())
		{
			medProf1end = rs.getString("pro1");
			LocalTime mp1 = LocalTime.parse(medProf1end,myFormatObj1);
			medProf2end = rs.getString("pro2");
			LocalTime mp2 = LocalTime.parse(medProf2end,myFormatObj1);
			doctorend = rs.getString("doc");
			LocalTime dend = LocalTime.parse(doctorend,myFormatObj1);
			pharmend = rs.getString("pharm");
			LocalTime phaend = LocalTime.parse(pharmend,myFormatObj1);
		    min_diff = (int)ChronoUnit.MINUTES.between(now,mp1)%60;
			if(min_diff>=0)
			{
				waitTime=waitTime+min_diff+1;//due to one minute shortage
				medProf1end = myFormatObj1.format(mp1.plusMinutes(5));
			}
			else
			{
				medProf1end = myFormatObj1.format(now.plusMinutes(5));
			}
			 min_diff = (int)ChronoUnit.MINUTES.between(LocalTime.parse(medProf1end,myFormatObj1),mp2)%60;
			 if(min_diff>=0)
			 {
				 waitTime=waitTime+min_diff; 
				 medProf2end = myFormatObj1.format(mp2.plusMinutes(5));
			 }
			 else 
			 {
				medProf2end = myFormatObj1.format(LocalTime.parse(medProf1end,myFormatObj1).plusMinutes(5));
			 }
			min_diff = (int)ChronoUnit.MINUTES.between(LocalTime.parse(medProf2end,myFormatObj1),dend)%60;
			if(min_diff>=0)
			{
				waitTime=waitTime+min_diff;
				doctorend = myFormatObj1.format(dend.plusMinutes(doctor));
			}
			else
			{
				doctorend = myFormatObj1.format(LocalTime.parse(medProf2end,myFormatObj1).plusMinutes(doctor));
			}
			min_diff = (int)ChronoUnit.MINUTES.between(LocalTime.parse(doctorend,myFormatObj1),phaend)%60;
			if(min_diff>=0)
			{
				waitTime=waitTime+min_diff;
				pharmend = myFormatObj1.format(phaend.plusMinutes(5));
			}
			else
			{
				pharmend = myFormatObj1.format(LocalTime.parse(doctorend,myFormatObj1).plusMinutes(5));
			}
			outTime = pharmend;
            String truncate = "truncate table availability";
            connection.createStatement().executeUpdate(truncate);
			String update = "insert into availability values('"+medProf1end+"','"+medProf2end+"','"+doctorend+"','"+pharmend+"')";
			connection.createStatement().executeUpdate(update);
			String insert_query = "insert into consultation (PatientID,InTime,DoctorTime,OutTime,Waiting_time) values("+patientId+",'"
					+inTime+"','"+doctorTime+"','"+outTime+"',"+waitTime+")";
			connection.createStatement().executeUpdate(insert_query);
			}
		else
		{
			medProf1end = myFormatObj1.format(now.plusMinutes(5));
			medProf2end = myFormatObj1.format(now.plusMinutes(10));
			doctorend = myFormatObj1.format(now.plusMinutes(10+doctor));
			pharmend = myFormatObj1.format(now.plusMinutes(15+doctor));
			String init = "insert into availability values('"+medProf1end+"','"+medProf2end+"','"+doctorend+"','"+pharmend+"')";
			connection.createStatement().executeUpdate(init);
			String insert_query = "insert into consultation (PatientID,InTime,DoctorTime,OutTime,Waiting_time) values("+patientId+",'"
					+inTime+"','"+doctorTime+"','"+pharmend+"',0)";
			connection.createStatement().executeUpdate(insert_query);
		}
		
	}
	static int getPatientID(String patientName,long patientNumber,Connection connection) throws SQLException
	{
		PreparedStatement pstmt = connection.prepareStatement("select Patient_ID from patientregisteration where Patient_Name=? AND "
				+ " Mobile=?");
		pstmt.setString(1,patientName );
		pstmt.setLong(2,patientNumber);
		ResultSet rs = pstmt.executeQuery();
		 int patientID=0;
		while(rs.next())
		{
			patientID = rs.getInt("Patient_ID");
		}
		return patientID;
	}
	static void showStatus(Connection connection) throws SQLException
	{
		String need = "select * from Consultation";
		Statement stmt  = connection.createStatement();
		ResultSet rs = stmt.executeQuery(need);
		while(rs.next())
		{
			System.out.print(rs.getInt("PatientID")+"\t   "+rs.getString("InTime")+"\t"+rs.getString("DoctorTime")+"\t  "
		+rs.getString("OutTime")+"\t"+rs.getInt("Waiting_time")+"\t");
			if(rs.getInt("Waiting_time")>0)
			System.out.println("Sorry");
			else
				System.out.println();
		}
	}

}
