package com.java.oops;

class Parent1 {
	public void property() {
		System.out.println("Land, Cash,Gold");
	}

	public void marry() {
		System.out.println("SubhLaxmi");
	}
}

class Child1 extends Parent {
	public void marry() {
		System.out.println("Suhani");
	}
}

public class Overriding_01_07 {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.marry();

		Child1 ch = new Child1();
		ch.marry();

	}

}
