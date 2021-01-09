package exceptionHandling;

import oops.abstraction.RBI;

public class MultipleCatchBlock {
	
	//throw : to throw an exception explicitly 
	static RBI rbi;

	public static void main(String[] args) {
		
		try {
		// Verify Launch browser
		System.out.println(10/1);
				
		// Verify login
		String str ="Ashish";
		System.out.println(str.charAt(5));
		
		// third step
		rbi.creditCard();
		
		}catch (ArithmeticException e)
		{
			System.out.println("Arithmatic exception:"+e.getMessage());
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("There is no such Index:"+e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println("common exception:"+e.getMessage());
		}
	}

}
