package Task5;

import java.util.Scanner;

public class NearestSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the array");
		for(int i=0;i<size;i++) {
		array[i]=sc.nextInt();
		}
		System.out.println("Enter the target");
		int target = sc.nextInt();
	int min=Integer.MAX_VALUE,sum=0;
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			for(int k=j+1;k<size;k++)
			{
				if(Math.abs(array[i]+array[j]+array[k]-target)<min)
				{
					min=array[i]+array[j]+array[k];
					
				}
			}
		}
	       
}
	System.out.println(min);

	}

}
