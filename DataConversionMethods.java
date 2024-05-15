package oopsConcepts;

public class DataConversionMethods {

	public static void main(String[] args) {
		
		//String->int, double, boolean
		//String->char(not possible)
		
		String s1="10";
		String s="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s));
		
		String s2= "10.5";
		String s3="10.5";
		System.out.println(Double.parseDouble(s2)+Double.parseDouble(s3));
		
		String s4="true";
		System.out.println(Boolean.parseBoolean(s4));
		
		//int, double, boolean -> String
		int a=10;
		double d =10.5;
		char c='A';
		boolean bool = true;
		
		String s5 = String.valueOf(a);
		System.out.println(s5);
		
		String s6= String.valueOf(d);
		System.out.println(s6);
		
		String s7= String.valueOf(c);
		System.out.println(s7);
		
		String s8 = String.valueOf(bool);
		System.out.println(bool);
		
		}

}
