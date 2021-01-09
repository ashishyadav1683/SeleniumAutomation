package oops.abstraction;

public class Kotak implements RBI{

	@Override
	public void savingAccount() {
		
		System.out.println("Kotak-Saving account");
	}

	@Override
	public void currentAccount() {

		System.out.println("Kotak-current account");
		
	}

	@Override
	public void creditCard() {

		System.out.println("Kotak-credit card");
		
	}

	@Override
	public void debitCard() {

		System.out.println("Kotak-debit card");
		
	}

}
