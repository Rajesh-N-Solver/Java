package Task5;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
public class DateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LocalDate date = LocalDate.now();
		//LocalTime time = LocalTime.now();
		//TimeFormat
		//LocalTime time1 = LocalTime.of(2, 6);
		//DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		//System.out.println(myFormatObj.format(date));
		//System.out.println(time);
		//System.out.println(time1);
		//System.out.println(new Date());
		//System.out.println();
		DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("hh:mm a");
		//System.out.println(myFormatObj1.format(LocalTime.now().plusMinutes(300)));
		System.out.println(myFormatObj1.format(LocalTime.now()));
		//LocalTime now = myFormatObj1.format(LocalTime.now());
		LocalTime now = LocalTime.now();
		LocalTime nowplus =  now.plusMinutes(121);
		//System.out.println(myFormatObj1.format(now));
		long min_diff = ChronoUnit.MINUTES.between(nowplus, now)%60;
		//long hr_diff = ChronoUnit.HOURS.between(now, nowplus)%60;
		System.out.println(min_diff);
		String str = "11:27 AM";
		LocalTime strc = LocalTime.parse(str, myFormatObj1);
		//System.out.println(myFormatObj1.format(strc.plusMinutes(35)));
		//System.out.println((int) ((Math.random() * (20 - 2)) + 2) );
		
	}

}
