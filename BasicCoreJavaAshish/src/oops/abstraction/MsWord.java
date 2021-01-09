package oops.abstraction;

/*1. you can't have abstract method inside an concrete class 
  2. Abstract class: class which have abstract keyword in their signature and can't be instantiated.
  3. Concrete class	: class which doesn't have abstract keyword in their signature and can be instantiated
*/
public abstract class MsWord {
	
	// Signature of method
	public abstract void save();
	/*
	 * {
	 * 
	 * // body of method }
	 */
	
	public abstract void insert();
	public abstract void table();
	public abstract void share();
	public abstract void convert();
	public abstract void font();
}
