package com.java.operator_assignment;

public class AssignmentOperator_01_14 {

	public static void main(String[] args) {
		// Simple Assignment
		int x = 10;

		// chained Assignment
		int a, b, c, d;
		a = b = c = d = 20;
		System.out.println(a + "---" + b + "---" + c + "---" + d);

		// Compound Assignment
		byte k = 23;
		k++;
		System.out.println(k);
		// k=(byte)(k+1)

		k += 1;
		System.out.println(k);
		// k=(byte)(k+1)

	}

}
