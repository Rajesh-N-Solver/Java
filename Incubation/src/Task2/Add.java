package Task2;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter N1");
	       int n1 = sc.nextInt();
	       int array1[] = new int[n1];
	       System.out.println("Enter Numbers");
	       for(int i=0;i<n1;i++)
	       {
	    	   array1[i]=sc.nextInt();
	       }
	       System.out.println("Enter N1");
	       int n2 = sc.nextInt();
	       System.out.println("Enter Numbers");
	       int array2[] = new int[n2];
	       int max,min;
	       int i,j;
	       for( i=0;i<n2;i++)
	       {
	    	   array2[i]=sc.nextInt();
	       }
	       max=n1<n2?n2+1:n1+1;
	       min=n1<n2?n1:n2;
	       int temp[] = new int[max];
	       int carry=0,t=max;
	       
	       for( i=n1-1, j=n2-1;i>=0 && j>=0;i--,j--)
	       {
	    	   temp[--t]=(array1[i]+array2[j])%10+carry;;
	    	    carry = (array1[i]+array2[i])/10;
	       }
	        {
	    	   if(max==n1+1)
	    		   for( i=max-min-2;i>=0;i--)
	    		   temp[--t]=(array1[i])+carry;
	    	   else
	    		   for( i=max-min-2;i>=0;i--)
	    		   temp[--t]=(array2[i])+carry;
	       }
	       temp[0]=carry;
	    	   for( i=0;i<max;i++)
	    		   System.out.print(temp[i]+" ");
	       

	}

}
