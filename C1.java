package oopsConcepts;

public class C1 extends C2 implements I1, I2 
{

	public static void main(String[] args) {
		C1 class1 = new C1();
		class1.m1();
		class1.m2();
		class1.m3();

	}

	@Override
	public void m2() {
		System.out.println(y);
		
	}

	@Override
	public void m1() {
		System.out.println(x);
		
	}

}
