package oops.abstraction;

public class Hdfc implements RBI {

	@Override
	public void savingAccount() {
		System.out.println("Hdfc-saving account");
		
	}

	@Override
	public void currentAccount() {

		System.out.println("Hdfc-current account");
		
	}

	@Override
	public void creditCard() {
		System.out.println("Hdfc-credit card");
		
	}

	@Override
	public void debitCard() {

		System.out.println("Hdfc-debit card");
		
	}

}
