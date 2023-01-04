package Task3;

import java.util.Scanner;

abstract class Base {
     public abstract void A();
    public  abstract void B();
}
  
   abstract class Derived extends Base {
    public  void A()
    {
        System.out.println("Derived A called");
    }
//    public void B()
//    {System.out.println("Derived Derived B called");
//}
 }
  class Over extends Derived{
	  public void B()
	  {
		  System.out.println("Overriden Derived  called");
	  }
	  public  void A()
	    {
	        System.out.println("Derived A called");
	    }
  }
  
class Test {
  
    public static void main(String args[])
    {
  
//        Base b = new Derived();
//        b.B();
        Base b1 = new Over();
        b1.B();
        b1.A();
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt()-1);
       // Base b2 = new 
    }
}
