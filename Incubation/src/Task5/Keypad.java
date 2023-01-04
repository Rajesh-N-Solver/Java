package Task5;

import java.util.Scanner;

public class Keypad {

	public static void printPossible(int number,String result,String[] keypad)
	{
		if(number==0||number==1)
		{
			System.out.println(result);
			return;
		}
		
		int last =number%10;
		for(int i=0;i<keypad[last].length();i++)
			{
			//result = keypad[last].charAt(i) +result;
			printPossible(number/10,keypad[last].charAt(i) +result,keypad);
			}
	}
	public static void main(String[] args) {
		String s1 = "w";//new String("w");
		String s2 ="w"; new String("x");
System.out.println(s1==s2);
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s1.equals(s2));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.next();
		
		int number = Integer.parseInt(str);
		String keypad[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		printPossible(number,"",keypad);
		
		
		
	}

}
