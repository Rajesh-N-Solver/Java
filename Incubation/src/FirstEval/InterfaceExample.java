package FirstEval;

import java.util.LinkedList;

interface ID{
	public void colour();
	void ID_Number();
	void role();
public 	static final int ID =5;
	 String Name();
	void Department();
	void Access();
	
}
class Zoho_ID  implements ID
{
	//static int id =5;
	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	@Override
	public void ID_Number() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void role() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String Name() {
		// TODO Auto-generated method stub
		return "Ram";
	}

	@Override
	public void Department() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Access() {
		// TODO Auto-generated method stub
		
	}
	
}
class Wipro_ID implements ID
{

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("colour");
		
	}

	
	

	@Override
	public void role() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}

	@Override
	public String Name() {
		// TODO Auto-generated method stub
		//System.out.println("hi");
	
		return "Rajesh";
		
	}

	@Override
	public void Department() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Access() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ID_Number() {
		// TODO Auto-generated method stub
		
	}

	
	
}
class swiping_machine
{
	
	static int a=5;
	int b=6;
	String building_name;
	public void Checkin(ID obj)
	{
		//static int a=5;
		System.out.println(obj.Name() + building_name);
		System.out.println(a);
		System.out.println();
		
	}
}
public class InterfaceExample
{
	public static void main()
	{
		//static i id =8;
		Zoho_ID zoho = new Zoho_ID();
		zoho.Name();
		 Wipro_ID wipro = new Wipro_ID();
		wipro.Name();
		Wipro_ID wipro2 = new Wipro_ID();
		//zoho.id;
		swiping_machine obj = new swiping_machine();
		obj.building_name="plot-A";
		swiping_machine obj2 = new swiping_machine();
		obj2.building_name="plot-B";
		obj.Checkin(zoho);
		obj.Checkin(wipro);
		obj2.Checkin(wipro2);
		LinkedList<Number> list = new LinkedList<Number>(); 
	}
}


