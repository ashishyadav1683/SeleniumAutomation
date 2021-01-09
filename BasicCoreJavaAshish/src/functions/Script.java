package functions;

public class Script {

	public static void main(String[] args) {
		
		// Static method : needs class name to call
		AccessModifiers.noAccessModifiers1();
		
		// Static-(return type-integer) function
		 int v =Library.sum(39,40);
		 System.out.println(v);
		 // Static function : to call need only Class name 
		 Library.print();
		 
		 //Non-static function : to call need to create object(instance) of that class
		 Library lib =new Library();
		 lib.nonStatic();
		 //Non-static (String-return type) function
		 String a= lib.printName("Ashish");
		 System.out.println(a);
		
		//Non-Static Access Modifiers (only public , noAccess(default) and protected functions) can be called at package level)
		 //i.e. in different class but in same package
		AccessModifiers ref = new AccessModifiers ();
		ref.publicFunction();
		ref.noAccessModifiers();
		ref.protectedFunction();
		
	}

}
 	 	