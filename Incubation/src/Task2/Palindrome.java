package Task2;

import java.util.Scanner;

public class Palindrome {
	public static boolean checkPalindrome(String str)
	{
	int start=0;
	int end = str.length()-1;
	str = str.toLowerCase();
	while(start<=end)
	{
		while(str.charAt(start) <'a' || str.charAt(start)>'z')
			start++;
		while(str.charAt(end)<'a' || str.charAt(end)>'z')
			end--;
		if(str.charAt(start)!=str.charAt(end) )
			return false;
		end--;
		start++;
	}
	
	return true;
	}

	public static void main(String[] args) {
		// . Given a String with or without special characters find if it is 
		//Palindrome or Not.. No splitting ofarray must be done or No additional
		//spaces must be used for storing the array..
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String");
       String input = sc.nextLine();
       if(checkPalindrome(input))
       {
    	   System.out.println("Yes");
       }
       else 
    	   System.out.println("No");
    	   
       sc.close();
       

	}

}
