package strings;

public class CountWordsInString {

	public static void main(String[] args) {
		 
		String S = "Java Programming Java OOps Java Selenium";
		
		String a[] = S.split(" ");
		int count=0;
		System.out.println(a.length);
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
			count++;
		}
		System.out.println("Number of words in a String: "+ count);
	}

}
