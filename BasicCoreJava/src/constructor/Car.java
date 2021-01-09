package constructor;

public class Car {

	// Non static variables defined at class level are known as instant variables
	String colour;
	String model;
	int engine;
	
	// Default value of String variable will ALWYSE  be null
	// for integer it is 0
	
	
	// Static  variables defined at class level are known as class variables
	static int wheels;
	
	public void features()
	{
		// Variables which are defined in a function are known as local variable
		int a = 10;
		System.out.println("Car features colour:"+colour+", model:"+model+" and engine size:"+engine+", wheels="+wheels);
	}

	// Constructor initializes object
	// Default constructor
	public Car()
	{
		
	}
	
	// Parameterized constructor
	public Car (String col, String mod, int eng)
	{
		colour =col;
		model= mod;
		engine =eng;
		
	}
	
	// constructor overloading - 2 or more constructor with different parameters
}
