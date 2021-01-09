package variableAndDataType;

import functions.AccessModifiers;

public class TestAccessModifierAtProjectLevel extends AccessModifiers{

	public static void main(String[] args) {
		
		
		// object reference of diff. class form diff. package
		// we have to import that class 
		AccessModifiers  ref = new AccessModifiers();  
		
		ref.publicFunction();// only public method available 
		
		// protected members can be accessed throughout the project by using (OBJECT) child class
		
		TestAccessModifierAtProjectLevel  obj =new TestAccessModifierAtProjectLevel ();
		obj.protectedFunction();

	}

}
