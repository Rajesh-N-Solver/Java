package Task1;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given a string check if it is Pangram or not. A pangram is a 
		//sentence containing every letter in the English Alphabet.
		Scanner sc = new Scanner(System.in);
		System.out.println("String1:");
		String str1 = sc.nextLine();
       // str1=str1.toLowerCase();
        int alpha[]=new int[26];
		char chararray[] = str1.toCharArray();
		for(int i=0;i<str1.length();i++)
		{
			int a = (int)chararray[i];
			if(a>64 && a<91)
			alpha[a-65]=1;
			else if(a>96 && a<123)
				alpha[a-97]=1;	
		}
		boolean check = true;
		for(int i=0;i<26;i++)
		{
			if(alpha[i]!=1)
			{
				check = false;
				break;
			}
		}
		if(check)
			System.out.println("1");
		else
			System.out.println("0");
		 sc.close();
			
	}

}
