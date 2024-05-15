package strings;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		 
		String S = "Java   Programming   Java   OOps   Java Selenium";
		
		System.out.println("Before removing white spaces: "+ S);
		
		S= S.replaceAll("\\s", "");// regular expression(//s) indicates space.
		
		System.out.println("After removing white spaces: "+ S);
	}

}
