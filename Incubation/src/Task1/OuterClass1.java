package Task1;
public class OuterClass1 

{ 
  int x = 10; // Instance variable of class OuterClass1. 
  static int y = 20; // Static variable of class OuterClass1. 
// Declaration of the static method. 
  static void m3() { 
    System.out.println("I am in OuterClass1 static method"); 
  } 
// Declaration of an instance method. 
   public void m1() { 
// Instance area of m1(). 
// Method local inner class starts here. 
  class InnerClass1 { 
    public void m2() 
    { 
      System.out.println("Value of x: " +x); 
      System.out.println("Value of y: " +y); 
       m3(); 
    } 
   } 
// Now, create an object of class InnerClass1. 
   InnerClass1 ic = new InnerClass1(); 
    ic.m2(); 
  } 
public static void main(String[] args) 
{ 
 OuterClass1 oc = new OuterClass1(); 
  oc.m1(); 
 } 
}