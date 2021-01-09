package oops.abstraction;

public class Union implements RBI {

	@Override
	public void savingAccount() {

		System.out.println("Union-saving account");
		
	}

	@Override
	public void currentAccount() {

		System.out.println("Union-current account");
	}

	@Override
	public void creditCard() {
		
		System.out.println("Union-credit card");
		
	}

	@Override
	public void debitCard() {

		System.out.println("Union-debit card");
	}

}
