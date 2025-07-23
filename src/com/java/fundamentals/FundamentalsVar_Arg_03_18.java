package com.java.fundamentals;

public class FundamentalsVar_Arg_03_18 {

	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10, 20);

	}

	public static void m1(int... x) {
		System.out.println("Var-Arg methods.");
	}

	public static void m1(int x) {
		System.out.println("General methods.");
	}
}
