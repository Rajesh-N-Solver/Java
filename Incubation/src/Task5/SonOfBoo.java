package Task5;

  class Boo{
public Boo(int i) {}
public Boo (String s) {}
public Boo(String s, int i) { }
//public Boo(String s,String a) {}
//public Boo(int a,String s) {}

}

 public class   SonOfBoo extends Boo {
	 public SonOfBoo(int i) {
		 
		 super ("Fred") ;
		 }
public SonOfBoo() {
	super ("boo");
}

public SonOfBoo(String s) {
super(42);
}
public SonOfBoo(int i, String s) {
//here the jvm invokes the super() but there is no default constructor in super class
}
public SonOfBoo(String s, String b, String c) {
super(s,b);//no such constructor in super class
}
public SonOfBoo(int i, int j) {
super("man", j);
}
public SonOfBoo(int i, int x, int y) {
super(i, "star");//no such constructor in superclass
}
public static void main(String[] args) {
	SonOfBoo a=new SonOfBoo(1);
	int ad = Math.abs(-5);
	
}
}