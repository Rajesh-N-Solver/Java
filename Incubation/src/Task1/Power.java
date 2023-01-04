package Task1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// Two numbers are entered through the keyboard. Write a program to find
		//the value of one number raised to the power of another. (Do not use Java builtin method).
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		if(number1>=0)
			{
			double pow=1;
			for(int i=0;i<number2;i++)
		{
			pow = number1*pow;
		}
			System.out.println(pow);
			}
		else
		{
			double pow=-1;
			for(int i=0;i<number2;i++)
		{
			pow =pow/number1;
		}
			System.out.println(pow);
			}
		 sc.close();	

	}

}
