package com.java.oops;

public class InstanceFlow_01_11 {
	int i = 10;
	{
		m1();
		System.out.println("First Instance Block.");
	}

	InstanceFlow_01_11() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		InstanceFlow_01_11 is = new InstanceFlow_01_11();
		System.out.println("Main");
	}

	public void m1() {
		System.out.println(j);
	}

	{
		System.out.println("Second Instance Block");
	}
	int j = 20;

}
