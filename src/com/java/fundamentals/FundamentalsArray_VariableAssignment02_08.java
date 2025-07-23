package com.java.fundamentals;

public class FundamentalsArray_VariableAssignment02_08 {

	public static void main(String[] args) {
		int[] x = { 10, 20, 30, 40, 50, 60, 70 };
		int[] y = { 11, 22, 33, 44, 55 };
//		y = x;
//		x = y;
		for (int x1 : x) {
			System.out.print(x1 + "\t");
		}

		System.out.println();
		
		for (int x1 : y) {
			System.out.print(x1 + "\t");
		}

	}

}
