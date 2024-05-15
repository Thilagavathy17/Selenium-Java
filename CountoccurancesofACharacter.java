package strings;

public class CountoccurancesofACharacter {

	public static void main(String[] args) {
		 
		String S = "Java Programming Java OOps Java Selenium";
		
		char a[] = S.toCharArray();
		int count=0;
		System.out.println(a.length);
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]=='J') {
				count=count+1;
			}
		}
		System.out.println("Number of occurances of character: "+ count);
	}

}
