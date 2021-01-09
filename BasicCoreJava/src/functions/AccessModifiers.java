package functions;

public class AccessModifiers {

	public static void main(String[] args) {
		
		// to call non-static function we have to create object even in same class
		AccessModifiers obj =new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.noAccessModifiers();
		obj.protectedFunction();
	}
	
	public void publicFunction()
	{
		System.out.println("Public function");
	}

	private void privateFunction()
	{
		System.out.println("Private Function");
	}
	
	void noAccessModifiers()
	{
		System.out.println("No Access M	odifier");
	}
	
	// protected members can be accessed throuout the project by using child class
	protected void protectedFunction()
	{
		System.out.println("Protected Function");
	}
}
