package com.teste;

public class testeEnumMain {
	public static void main(String [] args) {
		
		for (tipos tipo : tipos.values()) {
			System.out.println(tipo.getValor());
		}	
		System.out.println("ola");
		
		//tipos seila = tipo(2);
	}
}
