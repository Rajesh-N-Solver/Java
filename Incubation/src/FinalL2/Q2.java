package FinalL2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q2 {

	public static void main(String[] args) {
		int count=0,start=0,end=0;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Input String : ");
		String input2 = sc.nextLine();
		String input = "";
		char[] input1 = input.toCharArray();
		char[] temp = new char[input.length()];
		String output="";
		for(int i=0;i<input2.length();i++)
		{
			if(!input.contains(input2.substring(i, i+1)))
			{
				input=input+input2.substring(i, i+1);
				output=output+input2.substring(i, i+1)+Charcount(input2,input2.substring(i, i+1));
				//input= input+Charcount(input2,input2.substring(i, i+1));
			}
		}
		System.out.println(output);
	}

	private static int Charcount(String input2, String substring) {
		int count=0;
		for(int i=0;i<input2.length();i++) {
			if(input2.substring(i, i+1).equals(substring))
			{
				count++;
			}
		}
		return count;
		
	}

}
