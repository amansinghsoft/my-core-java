package com.java.exception_handling;

public class Example_01 {

	public static void main(String[] args) {
		System.out.println("Statement -1");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println(10 / 2);
		}
		System.out.println("Statement -3");

	}

}
