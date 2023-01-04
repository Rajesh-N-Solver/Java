package garbage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GarbageCollection {
	GarbageCollection i;
	static int a=0;

	public void finalize(){
		System.out.println(Thread.currentThread().getPriority());

		a++;
		// System.out.println("object is garbage collected");
	}


	public static void main(String[] args) {
		ExecutorService o = Executors.n
		Collection j;
		List l;
		Vector i = new Stack();
		Iterator i1;
		ListIterator li;ArrayList k;
		
		
		inner:
		for(int i=0;i<100000000;i++) {
			
			GarbageCollection obj1 = new GarbageCollection();
			//GarbageCollection obj12 = new GarbageCollection();

			//GarbageCollection obj2 = new GarbageCollection();
			if(a==1)
			{
				System.out.println(i);
				break inner;
			}
		}
	
	//System.gc();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println(a);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
System.out.println(Thread.currentThread().getPriority());
	}


}
