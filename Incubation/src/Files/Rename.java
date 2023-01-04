package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Rename {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 try{    
//	           Reader fw=new FileReader("D://rajesh//tenth//483//sample2.txt");    
//	          // fw.write("Welcome to javaTpoint.");  
//	           BufferedReader br = new BufferedReader(fw);
//	           String input =null;
//	           while((input=br.readLine())!=null) {
//	        	   System.out.println(input);
//	           }
//	           fw.close();    
			 InputStreamReader isr = new InputStreamReader(System.in);
			 BufferedReader br = new BufferedReader(isr);
			 System.out.println("Enter a line");
			 String input = br.readLine();
			 System.out.println(input);
			 
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");   

	}

}
