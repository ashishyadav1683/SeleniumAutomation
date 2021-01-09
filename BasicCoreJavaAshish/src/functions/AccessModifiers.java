package functions;

public class AccessModifiers {

	public static void main(String[] args) {

		AccessModifiers obj = new AccessModifiers ();
		
		obj.publicFunction();
		obj.privateFunction();
		obj.noAccessModifiers();
		obj.protectedFunction();
		
		// Static method: needs no object creation and class name required
		noAccessModifiers1();

	}
	
	// All are non-static functions
	public void publicFunction()
	{
		System.out.println("Public function");
	}
	
	private void privateFunction() {
		System.out.println("Private function");
	}
	
	void noAccessModifiers()
	{
		System.out.println("No access modifiers");
	}
	
	static void noAccessModifiers1()
	{
		System.out.println("No access modifiers1");
	}
	
	
	// Protected members can be access through out the project by using child class
	protected void protectedFunction()
	{
		System.out.println("Protected function");
	}

}
