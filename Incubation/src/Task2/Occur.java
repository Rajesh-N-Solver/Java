package Task2;

import java.util.Scanner;

public class Occur {  
    
    public static void main(String[] args) {  
          
    	Scanner sc = new Scanner(System.in);
	       System.out.println("Enter N1");
	       int n1 = sc.nextInt();
	       int arr[] = new int[n1];
	       int fr[] = new int[n1];
	       System.out.println("Enter Numbers");
	       for(int i=0;i<n1;i++)
	       {
	    	   arr[i]=sc.nextInt();
	       }  
        int visited = -1;  
        
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
         
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println(arr[i] + "-" + fr[i]);  
        }  
    }  
}  
