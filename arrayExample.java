package arrays;

public class arrayExample {
	
	//int array
	public void intArray() {
		int a[]= new int[5];// can store only 5 elements
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		for(int i:a) {
			System.out.println(i);
		}
	}
	
	//String array
		public void stringArray() {
			String a[]= new String[5];
			
			a[0] = "Cat";
			a[1] = "Dog";
			a[2] = "Puppy";
			a[3] = "animals";
			a[4] = "birds";
			
			for(String i:a) {
				System.out.println(i);
			}
		}
	
		// how to store elements without limit
		
		public void dynamicArray() {
			
			int a[] = {100,200,300,400,500};
			int sum=0;
			
			for(int i:a) {
				System.out.println(i);
				sum = sum+i;
			}
			System.out.println(sum);
		}
	

	public static void main(String[] args) {
		arrayExample array = new arrayExample();
		
		array.intArray();
		array.stringArray();
		array.dynamicArray();
		

	}

}
