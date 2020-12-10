package com.pattern.strategy.paymentExample;

public class CreditCardStrategy implements PaymentStrategy {
	
	private String name;
	private long creditCardNumber;
	private int securityCode;
	private String dateOfExpiry;
	
	public CreditCardStrategy(String name, long creditCardNumber, int securityCode, String dateOfExpiry) {
		this.name = name;
		this.creditCardNumber = creditCardNumber;
		this.securityCode = securityCode;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(double amount) {
		System.out.println(amount + " payed using Credit Card");
	}

}
