package Task5;
interface MyInterface{
	   public int num = 30;
	   public void demo();
	}
abstract class A
{
	int getSome()
	{
		return 7;
	}
	//abstract void printsome();
	
}
public class FinalTest extends A{
	 final int a =5;
	 static final int b;
	 final int c;
  FinalTest()
	 {
		 c=9;
	 }
  static void setb() {
	  b=0;
  }
	 void change_a()
	{
		a=6;
		b=8;
		
		System.out.println(a);
		System.out.println(b);
	}
	 static void change_b()
		{
			a=6;
			b=8;
			System.out.println(a);
			System.out.println(b);
		}
	public static void main(String[] args) {
		
		
		System.out.println(new FinalTest().getSome());
	}

}
