package functions;

public class Library {
	
	// Static - integer type function
	public static int sum(int a, int b)
	{
		return a+b;
	}
	
	public static void print()
	{
		System.out.println("Testing Static functions");
	}
	
	// Non-static functions
	public void nonStatic()
	{
		System.out.println("Testing non-static function");
	}
	
	// Non-static String type function
	public String printName(String name)
	{
		return "Your name is "+name;
	}

}
