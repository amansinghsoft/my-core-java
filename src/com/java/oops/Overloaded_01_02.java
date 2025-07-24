package com.java.oops;

public class Overloaded_01_02 {

	public void m1() {
		System.out.println("no-args");
	}

	public void m1(int i) {
		System.out.println("int-args");
	}

	public static void main(String[] args) {
		Overloaded_01_02 ol = new Overloaded_01_02();
		ol.m1();
		ol.m1(45);

	}

}
