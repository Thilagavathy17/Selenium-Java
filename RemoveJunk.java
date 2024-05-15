package strings;

public class RemoveJunk {

	public static void main(String[] args) {
		 
		String S = "Java@#$%^&&&***(((((())_Programming{}{>?<?%^&";
		
		S= S.replaceAll("[^a-zA-Z0-9]", "");// regular expression(//s) indicates space.
		
		System.out.println("After removing Junk Values: "+ S);
	}

}
