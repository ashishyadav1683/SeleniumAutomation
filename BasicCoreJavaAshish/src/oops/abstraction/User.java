package oops.abstraction;

public class User {

	//1. You can't create object of your abstract classes
	
	public static void main(String[] args) {
		
		MsWord ms = new Sprint3();
		
		ms.convert();
		ms.font();
		ms.save();
		ms.share();
		ms.table();
		ms.insert();

		

	}

}
