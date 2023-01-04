package Task2;
public class Test1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start;
		for(int i = 0; i <= 3; i++) {
			 start=(i+1)*(i+2)/2;
		      for(int j = 0; j <= 4-i; j++)
		         System.out.print("  ");
		         
		      for(int j = 0; j <= i; j++) {
		         System.out.print( "   "+start);
		         start--;}

		      System.out.println();
		   }
		for(int i = 3; i >= 0; i--) {
		 start=(i+1)*(i+2)/2;
		      for(int j = 4-i; j >= 0; j--)
		         System.out.print("  ");
		         
		      for(int j = i; j >=0; j--) {
		         System.out.print("   "+start);
		         start--;}

		      System.out.println();
		   }
	}

}
