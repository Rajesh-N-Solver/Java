package Task5;
abstract class AS
{
	void p()
	{
		System.out.println("hi");
	}
	abstract void ab();
}
abstract class AR extends AS
{
	void ARM()
	{
		
	}
}

public class Teststatic extends AR {
    static int a=7;
           int b=9;
           int c;
           int d=98;
        void  increment(int d)
        {
        	this.d++;
        }
        void ARM()
        {
        	
        }
     static void change(int val)
     {
    	 
    	 Teststatic obj = new Teststatic();
    	 obj.print();
    	 a=obj.b;
    	 int a;
    	 obj.print();
    	// System.out.println(a);
     }
     static {
    	 System.out.println();
    	 Teststatic obj = new Teststatic();
    	 obj.change();
     }
     void change()
     {
    	 a=10;
    	final int f;
    	// change();
     }
     void print()
     {
    	 System.out.println("Static var : "+a);
     }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         AS as = new Teststatic();
//         as.
		Teststatic obj = new Teststatic();
		obj.change();
		System.out.println(Teststatic.a);
		Teststatic.change(3);
		System.out.println(Math.random()*8);
		
		System.out.println();
		obj.increment(obj.d);
		System.out.println(obj.d);
		Teststatic obj1 = new Teststatic();
		System.out.println(obj1.d);
		int ss = 2;
		String ff = "2";
				System.out.println();
				Object n = new Object();
				System.out.println(obj1.toString());
	}
	

}
