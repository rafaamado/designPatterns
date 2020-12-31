package com.teste;

@FunctionalInterface //optional annotation
interface Sum {
	int sum(int x, int y);
}

interface Print {
	void hello(String name);
}

public class TestFunctionalInterface {
	
	public void hiFunction(Print myInterface) {
		myInterface.hello("Rafael");
	}
	
	public void hi(String name) {
		System.out.println("Hi " + name);
	}

	public static void main(String[] args) {
		Sum minhaSoma = (int x, int y) -> x + y;
		System.out.println(minhaSoma.sum(10, 5));
		
		TestFunctionalInterface teste = new TestFunctionalInterface();
		teste.hiFunction(teste::hi);
		
	}
}
