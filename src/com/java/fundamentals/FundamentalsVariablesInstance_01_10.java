package com.java.fundamentals;

public class FundamentalsVariablesInstance_01_10 {
	
	int x=10;
	
	public static void main(String[] args) {
		FundamentalsVariablesInstance_01_10 obj = new FundamentalsVariablesInstance_01_10();
		System.out.println(obj.x);
		obj.m1();
	}
	public void m1() {
		System.out.println(x);
	}

}
