package oops.polymorphism;

public class StaticPolymorphism {

	public static void main(String[] args) {

		// Static polymorphism = function overloading
		
		StaticPolymorphism obj = new StaticPolymorphism ();
		obj.sum(10,20);
		obj.sum(10,20,30);

	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int sum(int a, int b, int c)
	{
		return a+b+c;
	}

}
