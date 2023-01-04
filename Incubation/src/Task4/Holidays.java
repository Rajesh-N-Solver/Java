package Task4;

import java.util.Scanner;

public class Holidays{
	String name;
	int date;
	String month;
	public Holidays(String name,int date,String month)
	{
		this.name=name;
		this.date=date;
		this.month=month;
	}
	
	public boolean sameMonth(Holidays h)
	{
		return this.month==h.month;
	}
	public double avgDate(Holidays[] arr)
	{
		int sum=this.date;
		for(int i=1;i<arr.length;i++)
		{
			sum+=arr[i].date;
		}
		double avg=sum/arr.length;
	return avg;
	}
	public void createHoliday(String name,int date,String month)
	{
		Holidays h=new Holidays(name,date,month);
		System.out.println(h.name+" "+h.date+" "+h.month);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Holidays h1=new Holidays("Independence day",15,"August");
		Holidays h2=new Holidays("Republic day",26,"January");
		Holidays h3=new Holidays("Worker's day",5,"May");
		Holidays h4=new Holidays("Diwali day",22,"October");
		Holidays h5=new Holidays("Gandhi jayanti",2,"October");
		Holidays h6=new Holidays("Christmas",25,"December");
		Holidays h7=new Holidays("Teacher",5,"September");
		System.out.println(h4.sameMonth(h5));
		Holidays[] arr=new Holidays[3];
		for(int i=0;i<arr.length;i++)
		{
			String name=s.next();
			int date=s.nextInt();
			String month=s.next();
			Holidays h=new Holidays(name,date,month);
			arr[i]=h;
		}
		System.out.println(arr[0].avgDate(arr));
//		String name=s.next();
//		int date=s.nextInt();
//		String month=s.next();
//		h1.createHoliday(name,date,month);
		Holidays obj = new Holidays("Independence day",5,"July");
		
	}

}