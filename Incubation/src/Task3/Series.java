package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Series {

public static void main(String[] args)
{
    
       Scanner sc = new Scanner(System.in);
      int  n=sc.nextInt();
       if (n <= 0) {
            System.out.println('0');
        }
        if (n <= 3) {
        	System.out.println('1');
        }
        else{int[] data = new int[n];
        data[0] = 1;
        data[1] = 2;
        data[2] = 2;

        int i = 2, j = 2;
        int count = 1;
        int num = 1;
        
        outerLoop:
        while (i < n) {
            for (int k = 0; k < data[j]; k ++) {
            	
            	if(i+1 == data.length) {
            		break outerLoop;
            	}
            	
                data[++i] = num;
                if (num == 1 && i < n) {
                    count ++;
                }
            }
            j ++;
           
            num=num==2?1:2;
        }
        System.out.println(count);
        System.out.println(Arrays.toString(data));
    }
}
}
