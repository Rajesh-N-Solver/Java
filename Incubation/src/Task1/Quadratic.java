package Task1;

import java.util.Scanner; 

public class Quadratic {
	public static double find(double num)   
	{ 
	double t;  
	double sqrtroot=num/2;  
	do   
	{  
	t=sqrtroot;  
	sqrtroot=(t+(num/t))/2;  
	}   
	while((t-sqrtroot)!= 0);  
	return sqrtroot;  
	}  

	public static void main(String[] args) {
		// Write a Java program to solve quadratic equations (use if, else if and
		//else).

		
		Scanner in = new Scanner(System.in);  
		System.out.print("Enter the value of a: ");  
		double a = in.nextDouble();  
		System.out.print("Enter the value of b: ");  
		double b = in.nextDouble();  
		System.out.print("Enter the value of c: ");  
		double c = in.nextDouble();  
		double d= b*b - 4.0*a*c;  
		if (d> 0.0)   
		{  
		double r1 = (-b + find(d))/(2.0 * a);  
		double r2 = (-b - find(d))/(2.0 * a);  
		System.out.println("The roots are " + r1 + " and " + r2);  
		}   
		else if (d == 0.0)   
		{  
		double r1 = -b /(2.0 * a);  
		System.out.println("The root is " + r1);  
		}   
		else   
		{  
		    d=Math.abs(d);
		    System.out.println("Roots are");  
			System.out.println(-b/2.0*a+"+i"+(find(d)));
			System.out.println(-b/2.0*a+"-i"+(find(d)));
			
		}  
		in.close();
		}  
		



	

}
