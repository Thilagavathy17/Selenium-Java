package oopsConcepts;

interface Shape{
	
	//By default variables are static and final in interface.	
	int length =10;
	int width = 20;
	
	//Methods can be only unimplemented, default and static
	void circle(); //Abstract method
	
	default void square() {
		System.out.println("This is default method- square");
	}
	
	static void rectangle() {
		System.out.println("This is static method-rectangle");
	}
	
}

public class InterfaceDemo implements Shape {

	public static void main(String[] args) {
		
		//Scenario1
		InterfaceDemo id = new InterfaceDemo();
		id.circle();
		id.square();
		Shape.rectangle();
		id.sphere();
		
		//Scenario2
		
		Shape id1 = new InterfaceDemo();
		id1.circle();
		id1.square();
		Shape.rectangle();
		//id1.sphere(); // cannot access

	}

	@Override
	public void circle() {
		System.out.println("This is abstract method and implemented in class");
		
	}
	
	public void sphere() {
		System.out.println("Sphere method in class");
	}

}
