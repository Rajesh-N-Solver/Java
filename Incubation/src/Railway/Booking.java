package Railway;

public class Booking {
	int id;
	int seatnumber;
	int pnr;
	String name;
	int age;
	String gender;
	String berth;
	public Booking()
	{
		
	}
	void set(int id,int seatnumber,int pnr,String name,int age,String gender,String berth)
	{
	 this.id=id;
	 this.seatnumber=seatnumber;
	 this.pnr=pnr;
	 this.name=name;
	 this.age=age;
	 this.gender=gender;
	 this.berth=berth;
	}
	public Booking(Booking obj)
	{
		 //this.seatnumber=obj.seatnumber;
		 this.pnr=obj.pnr;
		 this.name=obj.name;
		 this.age=obj.age;
		 this.gender=obj.gender;
		 this.berth=obj.berth;
	}
	

}
