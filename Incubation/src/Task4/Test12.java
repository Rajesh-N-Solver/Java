package Task4;
import Task3.*;

public class Test12   {
	  public static void main(String[] args) {

		    // initialize the class with Integer data
		    DemoClass demo = new DemoClass();

		    // generics method working with String
		    demo.<String>genericsMethod("Java Programming");

		    // generics method working with integer
		   // demo.<Integer>genericsMethod(4));
		  }
		}

		class DemoClass {

		  // creae a generics method
		  public <T> void genericsMethod(T data) {
		    System.out.println("Generics Method:");
		    System.out.println("Data Passed: " + data);
		  }
		}

