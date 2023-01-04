package Task2;

import java.util.Scanner;

public class Prime {
	public static boolean isPrime(int n)
	{
		int i,m=0; 
		     m=n/2;      
		  if(n==0||n==1){  
		     return false;    
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     return false ;       
		    }      
		   }
		   return true;
		    }
	}
	public static int reverseNumber(int number) {
		int reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(isPrime(reverseNumber(n))&& isPrime(n))
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
			
		
	}

}
