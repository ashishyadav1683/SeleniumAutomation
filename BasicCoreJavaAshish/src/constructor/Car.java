package constructor;

public class Car {
	
	// Non-Static variables defined as class level is known as INSTANCE variables.
	String colour;
	String model;
	int engine;
	
	// Default value of string variable is null
	// Default value of integer variable is 0	
	
	// Static variables defined as class level is known as CLASS variables.
	static int wheels ;
	
	public void features()
	{
		// Variables defined in a function are known as local variables
		int a =10;
		System.out.println("Car featrues colours:"+colour+",model:"+model+" and engine size: "+engine+" wheels: "+wheels);
	}
	
	//Constructor : initializes object
	
	// Default constructor
	public Car()
	{
		
	}
	
	// Parameterized constructor
	public Car(String col, String mod, int eng)
	{
		model =mod;
		colour =col;
		engine =eng;
	}

	// Constructor overloading: two or more constructors with different parameters
}
