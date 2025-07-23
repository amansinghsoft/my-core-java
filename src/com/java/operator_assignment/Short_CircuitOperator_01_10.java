package com.java.operator_assignment;

public class Short_CircuitOperator_01_10 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		if (++x < 10 || ++y > 20) {
			x++;
		} else {
			y++;
		}
		System.out.println(x + "------" + y);

	}

}
