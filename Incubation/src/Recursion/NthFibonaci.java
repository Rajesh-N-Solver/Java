package Recursion;

public class NthFibonaci {
		static int fib(int n)
	    {
//	        if(n==1)
//	        	return 0;
//	        else if(n==2)
//	        	return 1;
	        if(n<=1)//for starting from 1th
	        	return n;
	        //if(n<=2)
	        //return n-1; for tarting from 0th
	        else return fib(n - 1) + fib(n - 2);
	    }
	 
	    public static void main(String args[])
	    {
	       // int n = 9;
	        System.out.println(fib(3));
	    }

	}


