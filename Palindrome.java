package strings;

public class Palindrome {
	
	public static void checkPalindrome() {
		
		String S = new String("MADAM");
		String rev = "";
		
		char a[] = S.toCharArray(); //Changing to array type to seperate as letters
		
		System.out.println(a.length);
				
		for(int i=a.length-1;i>=0;i--) {
			rev = rev+a[i];			
		}
		
		System.out.println(rev);
	}

	public static void main(String[] args) {
		checkPalindrome();

	}

}
