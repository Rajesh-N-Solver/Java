package Level2;

import java.util.Scanner;

public class FindSucceed {
	 static  void findSucceed(int[] input)
	{
		int length = input.length;
		int succeed=0;
		int[] result = new int[length+1];
		for(int i=0;i<length;i++)
		{
			succeed=succeed*10;
			succeed = succeed+input[i];
		}
		succeed++;
		for(int i=result.length-1;i>=0;i--)
		{
			result[i]=succeed%10;
			succeed=succeed/10;
		}
			if(result[0]!=0 )
			    System.out.print(result[0]+" ");

				for(int i=1;i<result.length;i++)
				System.out.print(result[i]+" ");
		}
			
	static void removeDuplicate(int[] input)
	{
		int length=input.length;
		int count=0;
		//int
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(input[i]==input[j])
				{
					for(int k=j;k<length-1;k++)
					{
						input[k]=input[k+1];
					}
					length--;
					count++;
					j--;
				}
			}
		}
		for(int i=0;i<length;i++)
			System.out.print(input[i]+",");
		for(int i=0;i<count;i++)
			System.out.print("-,");
	}
	static void dualSort(int[] input)
	{
		int length = input.length;
		int[] temparray = new int[length];
		for(int i=0;i<length;i++)
			temparray[i]=input[i];
		int[] result = new int[length];
		int temp;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
				{
				if(input[i]>input[j])
				{
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
				}
		}
		int to;
		if(length%2==0)
			to=length/2-1;
		else
			to=length/2;
		for(int i=0;i<=to;i++)
		{
			result[i*2]=input[i];
		}
//		for(int i=0;i<length;i++)
//			System.out.print(result[i]+" ");
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
				{
				if(temparray[i]<temparray[j])
				{
					temp=temparray[i];
					temparray[i]=temparray[j];
					temparray[j]=temp;
				}
				}
		}
		for(int i=0;i<=to-1;i++)
			result[i*2+1]=temparray[i];
		for(int i=0;i<length;i++)
		System.out.print(result[i]+" ");
			
		
	}
	static void sum(int[] input,int key)
	{
		int length=input.length;
		int count=0;
		boolean f=true;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(input[i]==input[j])
				{
					for(int k=j;k<length-1;k++)
					{
						input[k]=input[k+1];
					}
					length--;
					count++;
					j--;
				}
			}
		}
		count=0;
//		for(int i=0;i<length-1;i++)
//			System.out.print(input[i]+",");
		for(int i=0;i<length-1;i++) {
				for(int j=i+1;j<length-1;j++) {
			       {
					if(((input[i])+(input[j]))==key) {
						System.out.println("( " + input[i] + ',' + input[j] + " ) ,");
						f=false;
						count++;
					}
				}
				}				
			}
		if(f)
			System.out.println("no");
		else
			System.out.println(count);
		}
	static void product(int[] input)
	{
		int n=input.length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++)
				{
					if(input[i]*input[j]*input[k]>max)
					{
						max=input[i]*input[j]*input[k];
					}
				}
			}
		       
	}
		System.out.println(max);
	}
		
	

	public static void main(String[] args) {
		System.out.println("Enter the size:");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int[] input = new int[size];
		for(int i=0;i<size;i++)
		{
			input[i]=sc.nextInt();
			}
//		System.out.println("Enter Key");
//		int key=sc.nextInt();
		//int[] input = {9,9,9,8,7,6,6,5};
		findSucceed(input);
		//removeDuplicate(input);
		//dualSort(input);
		//sum(input,key);
		//product(input);
		
		

	}

}
