package Task3;

import java.util.Scanner;

public class Number1 {
	 public static void
	    sortLexicographically(String strArr[])
	    {
	        for (int i = 0; i < strArr.length; i++) {
	            for (int j = i + 1; j < strArr.length; j++) {
	                if (strArr[i].compareTo(strArr[j])
	                    < 0) {
	                    String temp = strArr[i];
	                    strArr[i] = strArr[j];
	                    strArr[j] = temp;
	                }
	            }
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
		
		System.out.println("Enter N : ");
		int n=in.nextInt();
		int A[] = new int[n];
		System.out.println("Enter Values");
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
		String strA[]= new String[n] ;
		for(int i=0;i<n;i++)
			strA[i]=Integer.toString(A[i]);
		 sortLexicographically(strA);
		 for (String string : strA)
	            System.out.print(string);

	}


}
