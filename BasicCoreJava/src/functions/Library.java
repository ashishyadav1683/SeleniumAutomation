package functions;

public class Library {
	
	public static int sum(int a , int b)
	{
		return a+b;
	}
	
	public static void print()
	{
		System.out.println("Testing static functions");
	}

	public void fun1()
	{
		System.out.println("Tesing non-static functions");
	}
	
	public String printName(String name)
	{
		return "Your name is "+name;
	}
}
