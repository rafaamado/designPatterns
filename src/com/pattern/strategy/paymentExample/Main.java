package com.pattern.strategy.paymentExample;

public class Main {

	public static void main(String[] args) {
		var cart = new ShoppingCart();
		cart.addItem(new Item(1, 200.0));
		cart.addItem(new Item(2, 600.0));
		
		cart.pay(new CreditCardStrategy("rafael amado", 123, 321, "10/28"));
		
		cart.pay(new PaypalStrategy("rafael", "123"));
	}
}
