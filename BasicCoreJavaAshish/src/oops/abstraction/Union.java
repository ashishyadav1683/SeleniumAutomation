package oops.abstraction;

public class Union implements RBI {

	@Override
	public void savingAccount() {

		System.out.println("Union-Saving account");
		
	}

	@Override
	public void currentAccount() {

		System.out.println("Union-Current account");
		
	}

	@Override
	public void debitCard() {

		System.out.println("Union-debit card");
	}

	@Override
	public void creditCard() {
		
		System.out.println("Union-credit card");
		
	}

}
