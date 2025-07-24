package com.java.oops;

class Parent {
	public void m1() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	public void m2() {
		System.out.println("Child");
	}
}

public class IS_A_Relationship_01_01 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();

		Child ch = new Child();
		ch.m1();
		ch.m2();

	}

}
