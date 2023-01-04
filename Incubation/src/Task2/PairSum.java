package Task2;
import java.util.Arrays;
import java.util.Scanner;

class PairSum {
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	
	System.out.println("Enter N : ");
	int n=in.nextInt();
	int A[] = new int[n];
	System.out.println("Enter Values");
	for(int i=0;i<n;i++) {
		A[i]=in.nextInt();
	}
	System.out.println("Enter K value : ");
	int key=in.nextInt();
	
	  
	int max=A[0];
	for(int i=1;i<n;i++) {
		if(max<A[i]) {
			max=A[i];
		}
	}
	
	int cv=max+1;

	for(int i=0;i<n;i++) {
		if(A[i]!=cv) {
			for(int j=i+1;j<n;j++) {
				if(A[i]==A[j]) {
					A[j]=cv;
				}		
			}
		}
	}
	
	int pairCount=0;
	for(int i=0;i<n;i++) {
		if(A[i]!=cv) {
			for(int j=i+1;j<n;j++) {
			if(A[j]!=cv) {
				if((A[i]+A[j])==key) {
					pairCount++;
					System.out.println("( " + A[i] + ',' + A[j] + " ) ,");
				}
			}
			}				
		}
	}
	System.out.print("Total Count : " + pairCount);
	}
}
	
