package com.java.oops;

public class SingletonClass_01_14 {
	private static SingletonClass_01_14 sc = new SingletonClass_01_14();

	private SingletonClass_01_14() {

	}

	public static SingletonClass_01_14 getSingletonClass_01_14() {
		return sc;
	}

	public static void main(String[] args) {
		SingletonClass_01_14 sc1 = SingletonClass_01_14.getSingletonClass_01_14();
		SingletonClass_01_14 sc2 = SingletonClass_01_14.getSingletonClass_01_14();

	}

}
