package strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String S ="Welcome";
		String S1 = new String(" To Java");
		String S2 = new String(" Tutorial");
		
		System.out.println(S);
		System.out.println(S1);
		
		System.out.println(S.length());// returns length of a String
		
		System.out.println(S+S1); // joining Strings
		System.out.println(S.concat(S1)); //concat()- can join only strings at a time
		
		System.out.println(S.concat(S1).concat(S2));
		
		//trim()- It will remove the spaces right and left side
		String S4 = "   Welcome   ";
		System.out.println(S4);
		System.out.println(S4.trim());
		
		//charAt- It returns character from a string based on index
		System.out.println(S.charAt(3));
		
		//contains()- particular string is part of the main string or not
		String S5 = "come";
		System.out.println(S.contains(S5));
		
		//equals and equalsIgnorecase - Compare strings
		String S6 = new String("Welcome");
		String S7 = "Welcome";
		System.out.println(S==S6);
		System.out.println(S.equals(S6));
		System.out.println(S==S7);
		System.out.println(S.equals(S7));
		
		//replace()- replace single/multiple(sequence of characters in a string)
		String S8 = "welcome to selenium java selenium python selenium c#";
		System.out.println(S8.replace('e', 'X'));
		System.out.println(S8.replace("selenium", "Priya"));
		
		//substring()- It extracts sub string from the main string
		String s9="Selenium";
		System.out.println(s9.substring(0, 3));
		
		//toUpperCase(), toLowerCase
		System.out.println(s9.toUpperCase());
		System.out.println(s9.toLowerCase());
		
		//split()- Split the string into multiple parts based on delimeter
		String s10= "abcdefgh@gmail.com";
		String a[] = s10.split("@");
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(Arrays.toString(a));
		
		//Example1
		String amount="$15,20,55"; //Output - 152055
		System.out.println(amount.replace("$","").replace(",",""));
		
		//Example2
		String s11 = "abc,123@xyz";  //Output -[abc, 123, xyz]
		String aa[] = s11.split(",");
		System.out.println(Arrays.toString(aa));
		String aa1[] = Arrays.toString(aa).split("@");
		System.out.println(Arrays.toString(aa1));
		
		// * % ^ & ( ) - you cannot use as delimeters
		
		//Example4
		String name = "John Kenedy";
		System.out.println(name.contains("john"));
		System.out.println(name.toLowerCase().contains("john"));
		
		
		
		
		
		
		
		
		
	}

}
