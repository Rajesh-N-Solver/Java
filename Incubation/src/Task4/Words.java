package Task4;
import java.util.Scanner;

public class Words  {
	private static int countWords(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c==' ')
			{
				count++;
			}
		}
	return count+1;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(countWords(str));

	}

}
