package oops.polymorphism;

import oops.inheritance.*;

public class DynamicPolymorphism {

	
	// you can use reference of parent class for the object of child class
	// In this scenario  you can call only those functions which are present in you parent class
	// In this scenario your overriden method will get call from your child class
	
	public static void main(String[] args) {
		
		Telephone mob = new Mobile();
		mob.calling();
		//mob.texting();
		
		// you must have inheritance in atleast two class
		// you must have minimum one overridden method in parent and child class
		// you must have reference of the parent class for the object of child class
		// you must call an overridden method using the reference of parent class
		
	}

}
