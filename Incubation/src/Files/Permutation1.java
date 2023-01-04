package Files;

//public class Permutation1 {
//	public static void main(String[] args)
//	{
//		String str = "ABC";
//		int n = str.length();
//		Permutation1 permutation = new Permutation1();
//		permutation.permute(str, 0, n - 1);
//	}
//
//	private void permute(String str, int l, int r)
//	{
//		if (l == r)
//			System.out.println(str);
//		else {
//			for (int i = l; i <= r; i++) {
//				str = swap(str, l, i);
//				permute(str, l + 1, r);
//				str = swap(str, l, i);
//			}
//		}
//	}
//
//	
//	public String swap(String a, int i, int j)
//	{
//		char temp;
//		char[] charArray = a.toCharArray();
//		temp = charArray[i];
//		charArray[i] = charArray[j];
//		charArray[j] = temp;
//		return String.valueOf(charArray);
//	}
//}

public class Permutation1 {
	public static void main(String[] args)
	{
		int[] str = {1,2,3};
		int n = str.length;
		Permutation1 permutation = new Permutation1();
		permutation.permute(str, 0, n - 1);
	}

	private void permute(int[] str, int l, int r)
	{
		if (l == r) {
			
		for(int a:str)System.out.print(a);
		System.out.println();
		}
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	
	public int[] swap(int[] charArray, int i, int j)
	{
		int temp;
		
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return charArray;
	}
}
