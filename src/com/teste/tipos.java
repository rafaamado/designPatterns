package com.teste;

public enum tipos {
	
	primeiro(1), segundo(2), terceiro(3);
	
	private final int valor;
	
	tipos(int valor){
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

}
