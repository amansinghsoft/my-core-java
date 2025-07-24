package com.java.oops;

public class Overloaded_02_03 {

	public void m1(int i) {
		System.out.println("int-arg");
	}
	
	public void m1(float f) {
		System.out.println("float-arg");
	}
	public static void main(String[] args) {
		Overloaded_02_03 ol = new Overloaded_02_03();
		ol.m1(89);
		ol.m1(65.76f);
		ol.m1('a');
		ol.m1(10l);

	}

}
