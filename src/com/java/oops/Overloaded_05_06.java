package com.java.oops;

class Animal {

}

class Monkey extends Animal {

}

public class Overloaded_05_06 {

	public void m1(Animal a) {
		System.out.println("Animal Version");
	}

	public void m1(Monkey m) {
		System.out.println("Monkey Version");
	}

	public static void main(String[] args) {
		Overloaded_05_06 ol = new Overloaded_05_06();

		Animal a = new Animal();
		ol.m1(a);

		Monkey m = new Monkey();
		ol.m1(m);

		Animal a1 = new Monkey();
		ol.m1(a1);

	}

}
