package com.java.oops;

public class Overloaded_03_04 {

	public void m1(int i, float f) {
		System.out.println("int-float-arg");
	}

	public void m1(float f, int i) {
		System.out.println("float-int-arg");
	}

	public static void main(String[] args) {
		Overloaded_03_04 ol = new Overloaded_03_04();
		ol.m1(89.4f, 54);
		ol.m1(23, 43.6f);
	}

}
