package Task2;

import java.util.Scanner;

public class Pattern2 {
		

			public static void main(String[] args) {
				pattern(5);
			}

			private static void pattern(int n) {

				int rows = 1;
				while(rows<n) {
					int spaces = rows;
					while(spaces<n-1) {
						System.out.print(" ");
						spaces++;
					}	
					int startNum = (rows*(rows+1))/2;
					int i = 0;

					while(i<rows) {
						System.out.print(startNum-- + " ");
						i++;
					}
					System.out.println();
					rows++;
				}

				rows = n;

				while(rows<=2*n-2) {
					
					int spaces = rows;
					while(spaces>n) {
						System.out.print(" ");
						spaces--;
					}
					int num = 2*n - rows-1;
					
					int startNum = (num*(num+1))/2;
					
					int i = 0;

					while(i<num) {
						System.out.print(startNum-- + " ");
						i++;
					}

					System.out.println();
					rows++;
				}}
		}
		
