package oops.inheritance;

public class User {

	public static void main(String[] args) {
		
		SmartPhone sp =new SmartPhone();
		sp.videoCalling();
		sp.calling();
		sp.texting();
		 
		System.out.println("***********");
		
		Telephone phone =new Telephone();
		phone.calling();

		System.out.println("********");
		
		Mobile mob =new Mobile();
		mob.texting();
		mob.calling();
	}

}
