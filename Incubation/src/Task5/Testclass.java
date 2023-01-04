package Task5;

import java.util.ArrayList;
import java.util.List;

public class Testclass {

	
int a;
public  List<Double> list = new ArrayList<>();
public  void populate()
{
	for(int i=0;i<100000;i++) {
		list.add(Math.random());
	}
	System.out.println("Y");
}
public static void main(String[] args) {
	System.out.println("Before");
	new Testclass().populate();
	System.out.println("After");
}
}
