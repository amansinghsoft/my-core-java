package com.java.multi_threading;

class MyThread1 extends Thread {
	public void start() {
		super.start();
		System.out.println("Start method");
	}

	public void run() {
		System.out.println("Run method");
	}
}

public class Overriding_Start_Method_02 {

	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		mt.start();

		System.out.println("Main method");

	}

}
