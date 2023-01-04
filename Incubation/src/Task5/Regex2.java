package Task5;

import java.util.regex.*;  
class Regex2{  
public static void main(String args[]){  
System.out.println("? quantifier ....");  
System.out.println(Pattern.matches("^\\w{1,}[@]\\w{1,}[.][a-z]+$", "rajesh@gmail.com"));
}}
