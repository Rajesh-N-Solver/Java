package FinalL2;

import java.util.Scanner;

public class Q3 {
	static int count=0;

	public static void main(String[] args) {
		int start=0,end=0;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Input String : ");
		String input2 = sc.nextLine();
		//System.out.println(palindrome("appa"));
		
		for(int i=0;i<input2.length();i++)
		{
			//int temp = i;
//			System.out.print(input2.substring(0,i+1)+" ");
//			System.out.println(input2.substring(i+1));
			if((palindrome(input2.substring(0,i+1)) && (palindrome(input2.substring(i+1)))))
			{
				count++;
			}
			
		}
		if(count>0)
		{
			System.out.println("Can be split into palindromic String");
		}
		else
		{
			System.out.println("Can't be split into palindromic String");
		}
	}

	private static boolean palindrome(String string) {
		char[] s = string.toCharArray();
		int start=0;
		int end = s.length-1;
		while(start<=end)
		{
			if(!(s[start]==s[end]))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
