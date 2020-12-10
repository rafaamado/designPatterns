package com.pattern.strategy.paymentExample;

public class PaypalStrategy implements PaymentStrategy {
	
	private String email;
	private String password;
	
	public PaypalStrategy(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	@Override
	public void pay(double amount) {
		
		if(email == "rafael" && password == "123")
			System.out.println(amount + " payed using Paypal");
		else
			System.out.println("Failed to authenticate");
	}

}
