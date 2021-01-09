package oops.abstraction;

public class User {
	
	// you can't create object of your abstract class
	
	public static void main(String[] args) {
		
		MsWord word = new Sprint3();// Sprint 3 is not an abstract class
		
		word.convert();
		word.font();
		word.table();
		word.insert();
		word.share();
		word.save();

	}

}
