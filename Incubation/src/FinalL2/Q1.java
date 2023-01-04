package FinalL2;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int count=0,start=0,end=0;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Input String : ");
		String input = sc.nextLine();
		char[] input1 = input.toCharArray();
		System.out.println("Odd or Even");
		String pos = sc.nextLine();
		if(pos.equals("Odd")) {
		for(int i=0;i<input1.length;i++)
		{
			if(input1[i]==' ')
			{
				
				count++;
				if(!(count%2==0))
				{
					
					end = i-1;
					reverse(input1,start,end);
					
				}
				else
				{
					start = i+1;
				}
			}
		}
		if(count%2==0) {
			reverse(input1,start,input1.length-1);
		}
		
		System.out.println(new String(input1));
	}
		else
		{
			for(int i=0;i<input1.length;i++)
			{
				if(input1[i]==' ')
				{
					
					count++;
					if((count%2==0))
					{
						
						end = i-1;
						reverse(input1,start,end);
						
					}
					else
					{
						start = i+1;
					}
				}
			}
			if(!(count%2==0)) {
				reverse(input1,start,input1.length-1);
			}
			System.out.println(new String(input1));
		}

}

	private static void reverse(char[] input1, int start, int end) {
		while(start<=end)
		{
			char temp = input1[start];
			input1[start] = input1[end];
			input1[end] = temp;
			start++;
			end--;
		}
		
		
	}
}
