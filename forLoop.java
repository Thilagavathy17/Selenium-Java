package loopingstmts;

public class forLoop {
	
	public void ascendingorder()
	{
		System.out.println("*** Print 1 to 10 Ascending order ***");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	
	public void descendingorder() {
		
		System.out.println("*** Print 1 to 10 descending order ***");
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		forLoop fl = new forLoop();
		fl.ascendingorder();
		fl.descendingorder();

	}

}
