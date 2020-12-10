package com.pattern.strategy.paymentExample;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> itens = new ArrayList<Item>();
	
	public void addItem(Item item) {
		itens.add(item);
	}
	
	public double calculateTotalValue() {
		return itens.stream().mapToDouble(Item::getPrice).sum();
	}
	
	public void pay(PaymentStrategy payment) {
		double amount = calculateTotalValue();
		payment.pay(amount);
	}
	
}
