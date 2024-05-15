package oopsConcepts;

public class MoMain {

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(10,20);
		mo.sum(10,2.5);
		mo.sum(7.5,10);
		
		ConstructorOverloading co = new ConstructorOverloading();
		System.out.println(co.volume());
		ConstructorOverloading co1 = new ConstructorOverloading(2.5,5.5,6.5);
		System.out.println(co1.volume());
		ConstructorOverloading co2 = new ConstructorOverloading(10.5);
		System.out.println(co2.volume());
		
		Encapsulation e = new Encapsulation();
		e.setAccno(100);
		int Accno = e.getAccno();
		System.out.println(Accno);
		
		e.setName("THilaga");
		String Name = e.getName();
		System.out.println(Name);
		
		e.setAmount(10000.10);
		double Amount = e.getAmount();
		System.out.println(Amount);
	}

}
