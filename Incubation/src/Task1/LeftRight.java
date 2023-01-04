package Task1;

import java.util.Scanner;

public class LeftRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Given an unsorted array arr[] of size N having both negative 
		//and positive integers. The task is place all negative element
		//at the end of array without changing the order of positive element 
		//and negative element.
		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter N");
	       int n = sc.nextInt();
	       int array[] = new int[n];
	       int c=-1;
	       for(int i=0;i<n;i++)
	       {
	    	   array[i]=sc.nextInt();
	       }
	       for(int i=0;i<n;i++)
	       {
	    	   if(array[i]>=0)
	    	   {
	    		   c++;
	    		 int j;
	    		  for( j=i;j>c;j--)
	    		  {
	    			  int temp = array[j];
	    			  array[j]=array[j-1];
	    			  array[j-1]=temp;
	    		  }
	    	   }
	       }
	       for(int i=0;i<n;i++)
	       {
	    	  System.out.println(array[i]);
	       }
	       sc.close();
	}

}
