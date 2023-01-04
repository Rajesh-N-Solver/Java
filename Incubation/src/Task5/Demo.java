package Task5;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	float n=s.nextFloat();
	float m=s.nextFloat();
	int k=(int)n;
	int j=(int)m;
	float sub=n-k;
	float sub1=m-j;
	
	if(j>k)
	{
		//System.out.println((j-k)*60-sub+sub1);
		if(Math.round((int)((j-k)*60)-(sub*100)+(sub1*100))>59)
		{
			System.out.print(Math.round((int)((j-k)*60)-(sub*100)+(sub1*100))/60+".");
			System.out.println(Math.round((int)((j-k)*60)-(sub*100)+(sub1*100))%60);
			
		}
		else {	
			System.out.println(Math.round((int)((j-k)*60)-(sub*100)+(sub1*100)));
		}
		}
	
	else 
	{
		System.out.println(Math.round((sub1*100)-(sub*100)));
	}
	
}
}
