package Task5;


/* Java program to show that if static method is redefined by
a derived class, then it is not overriding. */

// Superclass
interface G{
}

class Base {
	public Base()
	{
		this();
	}
	
	// Static method in base class which will be hidden in subclass
	 static void display() {
		System.out.println("Static or class method from Base");
	}
	
	// Non-static method which will be overridden in derived class
	public void print() {
		System.out.println("Non-static or Instance method from Base");
	}
}

// Subclass
class Derived extends Base {
	
	
	// This method is hidden by display() in Base
	 static void display() {
		System.out.println("Static or class method from Derived");
	}
	
	// This method overrides print() in Base
	public void print() {
		//private int a=6;
		final int a;
		//a=9;
		System.out.println("Non-static or Instance method from Derived");
}
}

// Driver class
public class Test {
	static int var=6;
	public static final int A=8;
	//A=0;
	int s=6;
	Integer fg = s;
	void f()
	{
		System.out.println(Math.PI);
	}
	
	Test()
	{

		super();
		hi();
	}
	public static void main(String args[ ]) throws Exception {
	        char a='4';
	        String ab= "12e";
	        char acb[]=ab.toCharArray();
	        for(char ax : acb) {
	        	System.out.println(ax);
	        	if(Character.isDigit(ax))System.out.println("num");
	        }
	        Character.isLetter(a);
		if(Character.isLetter(a))
		{
			System.out.println("yes");
		}
		
	Base obj1 = new Derived();
	//Base ob;
	//ob.display();
	Base.display();
	//static int a;
	Base o = new Base();
	if(o instanceof Derived )//try obj1 instead of o
		System.out.println("Yes");
	if(o instanceof Base )//try obj1 instead of o
		System.out.println("Yes");
	
		
	// As per overriding rules this should call to class Derive's static
	// overridden method. Since static method can not be overridden, it
	// calls Base's display()
	obj1.display();
		
	// Here overriding works and Derive's print() is called
	obj1.print();
	Test.var=6;
//	int a=7;
//	if(a==7)a
//		a=8;
//	System.out.println(a)
	hi();
	//Base obj11 = new Derived();
	System.out.println(Test.var);
	}
	public static final void hi()
	{
		System.out.println("hi");
	}
}

