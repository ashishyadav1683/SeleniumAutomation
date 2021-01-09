package oops.polymorphism;

import oops.inheritance.*;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		// You can use reference of your parent class for object of child class
		// In this scenario you can call only those functions which are present in your parent class.
		// In this scenario your overriden methods will get call from your child class

		Telephone mobile =new Mobile();
		mobile.calling();
		//mobile.texting();
		
		// We need to achieve inheritance
		// We need to have atleast one overridden method in child class
		// We must have reference of parent class for the object of child class
		// We must call an overridden method using the reference of parent class
		

	}

}
