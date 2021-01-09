package oops.abstraction;

public class Hdfc implements RBI {

	@Override
	public void savingAccount() {

		System.out.println("Hdfc-Saving account");
		
	}

	@Override
	public void currentAccount() {

		System.out.println("Hdfc-Current account");
		
	}

	@Override
	public void debitCard() {

		System.out.println("Hdfc-debit card");
		
	}

	@Override
	public void creditCard() {
		System.out.println("Hdfc-credit card");
	}
	

}
