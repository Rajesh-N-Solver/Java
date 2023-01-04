package Task1;

import java.util.Scanner;

public class FloatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Write a Java program that reads a floating-point number and prints
	//	"zero" if the number is zero. Otherwise, print "positive" or "negative". Add
	//	"small" if the absolute value of the number is less than 1, or "large" if it
	//	exceeds 1,000,000.	
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Input value: ");
		        double val = sc.nextDouble();

		        if (val>0)
		        {
		            if (val < 1)
		            {
		                System.out.println("Positive small");
		            }
		            else if (val > 1000000)
		            {
		                System.out.println("Positive large");
		            }
		            else
		            {
		                System.out.println("Positive");
		            }
		        }
		        else if (val < 0)
		        {
		            if (Math.abs(val) < 1)
		            {
		                System.out.println("Negative small");
		            }
		            else if (Math.abs(val) > 1000000)
		            {
		                System.out.println("Negative large");
		            }
		            else
		            {
		                System.out.println("Negative");
		            }
		        }
		        else
		        {
		            System.out.println("Zero");
		        }
		        sc.close();
		    }
		


	}


