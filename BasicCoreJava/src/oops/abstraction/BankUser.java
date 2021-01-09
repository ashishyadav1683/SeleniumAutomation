package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {

		//RBI - Interface/WebDriver
		//Hdfc - Chrom browser
		//Kotak - Firefox 
		//Union - Opera
		
		//RBI bank1 =new Kotak();
		
		/*
		 * bank1.creditCard(); bank1.currentAccount(); bank1.debitCard();
		 * bank1.savingAccount();
		 * 
		 * System.out.println("****************"); bank1 =new Hdfc();
		 * bank1.creditCard(); bank1.currentAccount(); bank1.debitCard();
		 * bank1.savingAccount();
		 * 
		 * System.out.println("*****************"); bank1 =new Union();
		 * bank1.creditCard(); bank1.currentAccount(); bank1.debitCard();
		 * bank1.savingAccount();
		 */
		test1();
	}

	public static void test1()
	{
		bank(new Hdfc());
		bank(new Union());
		bank(new Kotak());
	}
	
	public static void bank(RBI bank1)
		{
			bank1.creditCard();
			bank1.currentAccount();
			bank1.debitCard();
			bank1.savingAccount();
		}

}
