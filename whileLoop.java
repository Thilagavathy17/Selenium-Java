package loopingstmts;

public class whileLoop {
	
	//while loop
	public void whileloop()
	{
		int i=1;
		System.out.println("**********Print from 1 to 10**********");
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
	
	//print only even numbers
	public void evenNumbers()
	{
		int i=0;
		int n = 20;
		System.out.println("*********Even numbers**********");
		while(i<=n)
		{
			if(i%2==0) {
			System.out.println(i);
			}
			i++;
		}
	}
	
	//Print only odd numbers
	public void oddNumbers()
	{
		int i=0;
		int n = 20;
		System.out.println("*********odd numbers**********");
		while(i<=n)
		{
			if((i%2)!=0) {
			System.out.println(i);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		
		whileLoop lp = new whileLoop();
		lp.whileloop();
		lp.evenNumbers();
		lp.oddNumbers();

	}

}
