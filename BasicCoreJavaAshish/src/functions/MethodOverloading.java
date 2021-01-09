package functions;

public class MethodOverloading {

	public static void main(String[] args) {
		
		sum(30,40);
		sum(30,40,33);

	}
	
	public static void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b, int c)
	{
		System.out.println(a+b+c );
	}
	
	

}
