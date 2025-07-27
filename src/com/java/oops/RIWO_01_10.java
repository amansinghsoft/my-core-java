package com.java.oops;

public class RIWO_01_10 {
	static int i = 10;
	static {
		m2();
		System.out.println(i);// Direct Read
	}

	public static void m2() {
		System.out.println(i); // Indirect Read
	}

}
