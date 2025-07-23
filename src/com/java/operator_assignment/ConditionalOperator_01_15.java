package com.java.operator_assignment;

public class ConditionalOperator_01_15 {

	public static void main(String[] args) {
		// x=(condition)?true:false;

		int x = (10 < 20) ? 30 : 40;
		System.out.println(x);

		int y = (10 > 20) ? 30 : ((40 > 50) ? 60 : 70);
		System.out.println(y);

	}

}
