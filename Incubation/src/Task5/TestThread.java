package Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThread {
	Object a = new Object();

   public static void main(final String[] arguments) throws InterruptedException,ExecutionException {

     ArrayList<Object>  o= new ArrayList<Object>();
     a.add("i");
     //a.add(new Integer(1));
     String ab = (String)a.get(0);
     Object abc = (Object)ab;
     System.out.println(abc);
//    Iterator l = a.listIterator();
//     while(l.hasNext()) {
//    	 System.out.println((String)l.next());
//     }
       
     ExecutorService executor = Executors.newSingleThreadExecutor();
    

      System.out.println("Factorial Service called for 10!");
      Future<Long> result10 = executor.submit(new FactorialService(10));

      System.out.println("Factorial Service called for 20!");
      Future<Long> result20 = executor.submit(new FactorialService(20));

      Long factorial10 = result10.get();
      System.out.println("10! = " + factorial10);

      Long factorial20 = result20.get();
      System.out.println("20! = " + factorial20);

      executor.shutdown();
   }  

   static class FactorialService implements Callable<Long> {
      private int number;

      public FactorialService(int number) {
         this.number = number;
      }

      @Override
      public Long call() throws Exception {
         return factorial();
      }

      private Long factorial() throws InterruptedException {
         long result = 1; 
         
         while (number != 0) { 
            result = number * result; 
            number--; 
            Thread.sleep(100); 
         }
         return result;	
      }
   }
}