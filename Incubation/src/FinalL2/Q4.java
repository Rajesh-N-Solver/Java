package FinalL2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q4 {
	static int max =0;

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Input String : ");
		String input2 = sc.nextLine();
		int k=0,j=0;
		
		while(k<input2.length()) {
		
		for(int i=0;i<input2.length();i++)
		{
			//System.out.print(i+" ");
			int start =i;
			for( j=i;j<=i+k && j<input2.length() && i+k<input2.length();j++)
			{
				//System.out.print(a[j]);
				
			}
			//System.out.println(j-1);
			int end = j-1;
			if(input2.substring(start,end+1).length()==(RT(input2.substring(start,end+1)).length()))
			{
				if(max<input2.substring(start,end+1).length())
					max=input2.substring(start,end+1).length();
			}
	
		}
		k++;
		
		}
		System.out.println(max);
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
	private static String RT(String str)
	{
		LinkedHashSet<Character> set = new LinkedHashSet<>();  
        for(int i=0;i<str.length();i++)   
            set.add(str.charAt(i)); 
        String a="";
        for(Character ch : set)   
             a=a+ch;
        System.out.println(str+" - "+a);
        return a;
	}

}
