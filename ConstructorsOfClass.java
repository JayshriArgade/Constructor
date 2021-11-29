package Constructor;

public class ConstructorsOfClass 
{
	ConstructorsOfClass()
	{
		System.out.println("This is non-parameterised constructer");
	}
	
	ConstructorsOfClass(String s)
	{
		System.out.println(s);
		System.out.println("This is parameterised constructer");
	}
	
	void display(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition = "+c);
	}

	public static void main(String[] args)
	{
		ConstructorsOfClass cs = new ConstructorsOfClass();
		
		cs.display(23, 30);
		
		ConstructorsOfClass cs1 = new ConstructorsOfClass("Displaying");
		
		cs1.display(4, 5);
	}

}
