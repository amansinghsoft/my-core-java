package com.java.oops;

public class Constructor_01_12 {

	String name;
	int rollNo;

	public Constructor_01_12(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		Constructor_01_12 s1 = new Constructor_01_12("aman", 45);
		Constructor_01_12 s2 = new Constructor_01_12("Mohan", 44);
		System.out.println(s1.name + "---" + s1.rollNo);
		System.out.println(s2.name + "---" + s2.rollNo);

	}

}
