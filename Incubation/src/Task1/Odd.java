package Task1;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//.Write a program in Java to display the n terms of odd natural number
		//and their sum.
		 System.out.print("Enter number: ");
		 Scanner sc = new Scanner(System.in);
		 int n= sc.nextInt();
		 int sum =0;
		 for(int i=1;i<=n;i++)
		 {
			 System.out.println(2*i-1);
			 sum=sum+(2*i-1);
		 }
		 System.out.println(sum);
		 sc.close();
	}

}
