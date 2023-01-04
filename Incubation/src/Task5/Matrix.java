package Task5;

import java.util.Scanner;

public class Matrix {

	public static void reverse(int[] arr)
	{
	     int length = arr.length;
	     for (int i = 0; i < arr.length / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[arr.length - 1 - i];
	            arr[arr.length - 1 - i] = temp;
	        }
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size =sc.nextInt();
		int[][] matrix = new int[size][size];
		System.out.println("Enter the matrix");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				if(i!=j)
				{
					int temp = matrix[i][j];
					matrix[i][j]=matrix[j][i];
					matrix[j][i]=temp;
				}
			}
		}
		for( int i=0;i<matrix.length;i++)
		{
			reverse(matrix[i]);
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
