package application;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		
		Person p1 = new Person(1, "Jack Atlas", "jack@domain.com");
		Person p2 = new Person(2, "Seto Kaiba", "kaiba@domain.com");
		Person p3 = new Person(3, "Joao Silva", "silva@domain.com");
		System.out.println(p1);
		System.out.println(p3);
		System.out.println(p2);
		

	}

}
