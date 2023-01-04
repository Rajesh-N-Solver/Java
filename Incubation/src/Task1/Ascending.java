package Task1;

import java.util.Scanner;

public class Ascending {
	static void sortarray(int[] array,int length)
	{
		for(int i=0;i<length-1;i++)
 	   {
 		   for(int j=0;j<length-i-1;j++)
 		   {
 		
 			   if(array[j]>array[j+1])
 				   {
 				   int temp = array[j];
	    			   array[j]=array[j+1];
	    			   array[j+1]=temp;
	    		   }
 				   }
 		    
 	   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given an array of size N containing only 0s, 1s, and 2s;
		//sort the array in
		//ascending order.

		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter N");
	       int n = sc.nextInt();
	       int array[] = new int[n];
	       boolean check=true;
	       for(int i=0;i<n;i++)
	       {
	    	   array[i]=sc.nextInt();
	    	   if(array[i]>2 || array[i]<0)
	    	   {
	    		   check=false;
	    		  // break;
	    	   }
	       }
	       sortarray(array,n);
	       if(!check)
	       {
	    	   System.out.println("Wrong Input"); 
	       }
	       else
	       {
	    	   
	    	   for(int i=0;i<n;i++)
		       {
	    		   System.out.println(array[i]);
		       }
	       }
	       sc.close();
	}

}
