package com.java.oops;

public class Overloaded_04_05 {

	public void m1(int x) {
		System.out.println("General Method.");
	}

	public void m1(int... x) {
		System.out.println("Var-Arg Method.");
	}

	public static void main(String[] args) {
		Overloaded_04_05 ol = new Overloaded_04_05();
		ol.m1(98);
		ol.m1(10, 47);
		ol.m1();

	}

}
