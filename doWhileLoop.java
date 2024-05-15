package loopingstmts;

public class doWhileLoop {
	
	//do while loop
			public void whileloop()
			{
				int i=20;
				System.out.println("**********Print from 1 to 10**********");
				do
				{
					System.out.println(i);
					i++;
				}while(i<=10);
			}

	public static void main(String[] args) {
		doWhileLoop dwl = new doWhileLoop();
		dwl.whileloop();
		
	}

}
