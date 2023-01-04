package Task5;

class Apple
{
	//@Entity
	private int a;
	public void a(String a)
	{
		System.out.println("hi");
	}
}
 class  Apple1 extends Apple{

	public void a(Object i)
	{
		Apple ab = new Apple();
		System.out.println("hi");
	}
	
	

}
 public class TestInterface extends Apple1{
	 public static void main(String[] args) {
		 
		TestInterface obj = new TestInterface();
		//int a =5;
		//obj.a(a);
		int one =1,two=2;
		String a="a";
		String b="b";
		String bb = a+b;
		System.out.println(a.concat(b));
		 
		} 
 }
 
