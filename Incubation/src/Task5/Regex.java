package Task5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {


 public static void main(String args[])
 {
	     Scanner sc = new Scanner(System.in);
         System.out.println("Enter the input");
         String input = sc.next();
         System.out.println("Enter pattern");
         String pattern = sc.next();
     System.out.println(Pattern.matches( pattern,input));

 }
}