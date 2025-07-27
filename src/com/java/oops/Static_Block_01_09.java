package com.java.oops;

public class Static_Block_01_09 {
	static int i = 10;
	static {
		m1();
		System.out.println("First Static Block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Main Method");
		System.out.println(Static_Block_01_09.i);
	}

	public static void m1() {
		System.out.println(j);
	}

	static {
		System.out.println("Second Static Block");
	}
	static int j = 20;

}
