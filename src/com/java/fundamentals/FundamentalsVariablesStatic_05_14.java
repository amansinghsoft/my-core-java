package com.java.fundamentals;

public class FundamentalsVariablesStatic_05_14 {

	static int x = 10;
	int y = 25;

	public static void main(String[] args) {
		FundamentalsVariablesStatic_05_14 obj1 = new FundamentalsVariablesStatic_05_14();
		
		obj1.x = 888;
		obj1.y = 999;

		FundamentalsVariablesStatic_05_14 obj2 = new FundamentalsVariablesStatic_05_14();

		System.out.println(obj2.x + "------" + obj2.y);

	}

}
