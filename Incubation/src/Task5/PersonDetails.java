package Task5;
import java.util.Scanner;
interface Contact
{
void setName(String name);
public String getName();
public String getEmail();

}
public class PersonDetails {
	private long  mobileNumber;
	private String name;
	private String email;
	public PersonDetails(long mobileNumber,String name,String email) {
    this.mobileNumber=mobileNumber;
    this.name=name;
    this.email=email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    public void changeNumber() {
		System.out.println("******"+mobileNumber%10000);
		System.out.println("Enter your Old Number");
		Scanner sc = new Scanner(System.in);
		long old_number = sc.nextLong();
		if(old_number==this.mobileNumber)
		{
			System.out.println("Enter your new Number");
			long new_number = sc.nextLong();
			mobileNumber = new_number;
			System.out.println("Successfully Changed");
		}
		else 
		{
			System.out.println("Unauthorized entry");
		}
	}
	public static void main(String[] args)
	{
		Details person_1 = new  Details(9629876217L,"Rajesh","rajesh@gmail.com");
        person_1.changeNumber();
	}
	
	
}
