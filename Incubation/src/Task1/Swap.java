package Task1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to swap two variables.

		System.out.println("Enter Number 1");
		Scanner sc = new Scanner(System.in);
		int var1 = sc.nextInt();
		System.out.println("Enter Number 2");
		int var2 = sc.nextInt();
		System.out.println("Before : "+"("+var1+","+var2+")");
		int temp = var1;
		var1=var2;
		var2=temp;
		System.out.println("After : "+"("+var1+","+var2+")");
		sc.close();
	}

}
