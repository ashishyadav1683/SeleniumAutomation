package functions;

public class Script {

	public static void main(String[] args) {
		
		Library.sum(10, 20);
		Library.print();
		
		Library ref = new Library(); // creating object and reference from Library class for non-static methods
		ref.fun1();
		String data = ref.printName("Ashish");
		System.out.println(data);
		
		AccessModifiers ref2 =new AccessModifiers(); // object reference of another class form same package
		ref2.publicFunction();
		ref2.noAccessModifiers();
		ref2.protectedFunction();
	
		
		
	}

}
