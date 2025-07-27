package com.java.oops;

public class Constructor_02_13 {

	Constructor_02_13() {
		this(10);
		System.out.println("no-args.");
	}

	Constructor_02_13(int i) {
		this(10.5);
		System.out.println("int-args");
	}

	Constructor_02_13(double d) {
		System.out.println("double-args");
	}

	public static void main(String[] args) {
		Constructor_02_13 cv = new Constructor_02_13();
		Constructor_02_13 cv1 = new Constructor_02_13(10);
		Constructor_02_13 cv2 = new Constructor_02_13(10.3);
		Constructor_02_13 cv3 = new Constructor_02_13(10l);

	}

}
