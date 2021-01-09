package oops.polymorphism;

public class StaticPolymorphism {

	
	// Function overloading = Static polymorphism
	public static void main(String[] args) {

		StaticPolymorphism pl = new StaticPolymorphism ();
		int a = pl.sum(39,49);
		System.out.println(a);
		int b=pl.sum(20,33,34);
		System.out.println(b);

	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}

}
