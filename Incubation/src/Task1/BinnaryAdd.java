package Task1;

import java.util.Scanner;

public class BinnaryAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to add two binary numbers.

		  long num1, num2;
		  int i = 0, rem = 0;
		  int[] sum = new int[20];
		  Scanner in = new Scanner(System.in);

		  System.out.print("Enter first number: ");
		  num1 = in.nextLong();
		  System.out.print("Enter second numberS: ");
		  num2 = in.nextLong();

		  while (num1 != 0 || num2 != 0) 
		  {
		   sum[i++] = (int)((num1 % 10 + num2 % 10 + rem) % 2);
		   rem = (int)((num1 % 10 + num2 % 10 + rem) / 2);
		   num1 = num1 / 10;
		   num2 = num2 / 10;
		  }
		  if (rem == 1) {
		   sum[i++] = rem;
		  }
		 --i;
		  while (i >= 0) {
		   System.out.println(sum[i--]);
		  }
		   in.close();
		 }
		

	}


