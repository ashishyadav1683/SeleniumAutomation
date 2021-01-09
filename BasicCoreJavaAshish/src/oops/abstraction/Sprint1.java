package oops.abstraction;

// 1. You can't have abstract method in concrete class
// 2. An abstract class can have concrete methods
public abstract  class Sprint1 extends MsWord{

	
	public void save() {
		
		System.out.println("Saving feature");
		
	}

	
	public void insert() {

		System.out.println("Insert feature");
		
	}

	
}
