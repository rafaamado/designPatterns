package com.teste;

import java.util.HashSet;
import java.util.Set;

public class testeSet {

	public static void main(String[] args) {
		Set<Person> people = new HashSet<Person>();
		
		people.add(new Person(5, "Rafael", 30));
		people.add(new Person(2, "Henrique", 25));
		people.add(new Person(1, "Amado", 20));
		
		people.forEach(System.out::println);
		
		/*for (Person p : people) {
			System.out.println(p);
		}*/
		
		Person p1 = new Person(5, "Rafael", 30);
		Person p2 = new Person(5, "Henrique", 25);
		
		System.out.println("Equals: " + (p1.equals(p2)) );
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}

}
