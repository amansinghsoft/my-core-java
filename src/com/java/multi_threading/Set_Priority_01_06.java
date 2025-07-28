package com.java.multi_threading;

class MyThreadt extends Thread {

}

public class Set_Priority_01_06 {

	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(7);
		MyThreadt my = new MyThreadt();
		System.out.println(my.getPriority());

	}

}
