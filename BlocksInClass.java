package Constructor;

public class BlocksInClass 
{
	//Instead of main(), static and instance blocks are used
		
	static
	{
		BlocksInClass bc = new BlocksInClass();
		bc.print();
			
		System.out.println("Static Block");
		System.out.println();
			
	}
		
	void print()
	{
		System.out.println("Method called from static block");
	}

		//instance block
	{
		System.out.println("Instance Block");
	}

}

