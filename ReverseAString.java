package strings;

public class ReverseAString {
	
	// s = "Welcome"
	//reverse a string = emoclew

	public static void main(String[] args) {
		
		//Approach1 length(), charAt()
		String s ="Welcome";
		String rev ="";
		System.out.println(s.length());
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("After reversing a string: "+ rev);
		
		
		//Approach2 - toCharArray()
		String s1 = "Welcome";
		String rev1 = "";
		
		char a[] = s1.toCharArray();
		
		for(int i=a.length-1;i>=0;i--) {
			rev1= rev1+a[i];
		}
		System.out.println(rev1);
		
		
		//Approach3 - StringBuffer, StringBuilder
		StringBuffer s2 = new StringBuffer("Welcome");
		System.out.println(s2.reverse());
		
		StringBuilder s3 = new StringBuilder("Welcome");
		System.out.println(s3.reverse());
		
		
	}

}
