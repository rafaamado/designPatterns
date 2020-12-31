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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
}
