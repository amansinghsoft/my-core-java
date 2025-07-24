package com.java.declaration_and_access_modifiers;

interface Left {
	int x = 777;
}

interface Right {
	int x = 999;
}

public class Interface_01_07 {

	public static void main(String[] args) {
		System.out.println(Left.x);
		System.out.println(Right.x);

	}

}
