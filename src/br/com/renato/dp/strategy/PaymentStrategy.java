package br.com.renato.dp.strategy;

public interface PaymentStrategy {
	public void pay(int amount);
}

class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
		this.name = nm;
		this.cardNumber = ccNum;
		this.cvv = cvv;
		this.dateOfExpiry = expiryDate;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Transaction Data: ");
		System.out.println(name);
		System.out.println(cardNumber);
		System.out.println(cvv);
		System.out.println(dateOfExpiry);
		System.out.println(amount + " paid with credit/debit card");
	}

}

class PaypalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;

	public PaypalStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Transaction Data: ");
		System.out.println(emailId);
		System.out.println(password);
		System.out.println(amount + " paid using Paypal.");
	}

}
