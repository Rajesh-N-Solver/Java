package Railway;
class MultithreadingDemo implements Runnable {
	public void run()
	{
		try {
			
			System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
		}
		catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

public class TestStatic {
	public static void main(String[] args)
	{
		int n = 8; 
		for (int i = 0; i < n; i++) {
			//MultithreadingDemo object
			Thread object	= new Thread(new MultithreadingDemo());
			object.run();
		}
	}
}
