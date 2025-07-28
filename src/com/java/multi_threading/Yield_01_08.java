package com.java.multi_threading;

class MyThread4 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}

public class Yield_01_08 {

	public static void main(String[] args) {
		MyThread4 t = new MyThread4();
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
