package com.java.operator_assignment;

public class Short_CircuitOperator_02_11 {

	public static void main(String[] args) {
		int x = 10;
		if (++x < 10 && (x / 0 > 10)) {
			System.out.println("Hello");
		}else {
			System.out.println("Hiiii");
		}

	}

}
