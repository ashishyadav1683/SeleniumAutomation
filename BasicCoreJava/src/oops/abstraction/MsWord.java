package oops.abstraction;

// you can't have abstract methods inside an concrete class 
// Abstract class:classes which have abstract keyword in their signature and can't be instantiated
// Concrete class : classes which do not have abstract keyword in their signature and can be instantiated

public abstract class MsWord {
	
	//signature of method
	public abstract  void save();
	/*{
		Body of method
	}*/
	
	public abstract void insert();
	public abstract void table();
	public abstract void share();
	public abstract void convert();
	public abstract void font();
	

}
