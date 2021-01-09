package oops.abstraction;

public class BankUsers {

	public static void main(String[] args) {

		// RBI = WebDriver
		// Hdfc = Chrome browser
		// Union = Firefox browser
		// Kotak = Opera 
		
		/*
		 * RBI rb = new Hdfc(); rb.creditCard(); rb.currentAccount(); rb.debitCard();
		 * rb.savingAccount();
		 * 
		 * System.out.println("******************"); rb =new Kotak(); rb.creditCard();
		 * rb.currentAccount(); rb.debitCard(); rb.savingAccount();
		 * 
		 * System.out.println("******************"); rb =new Union(); rb.creditCard();
		 * rb.currentAccount(); rb.debitCard(); rb.savingAccount();
		 */
		test1();
	}
	
	public static void test1()
	{
		bank(new Hdfc());
		bank(new Union());
		bank(new Kotak());
		
	}
	
	public static void bank(RBI rb)
	{
		rb.creditCard();
		rb.currentAccount();
		rb.debitCard();
		rb.savingAccount();
		
	}

}
