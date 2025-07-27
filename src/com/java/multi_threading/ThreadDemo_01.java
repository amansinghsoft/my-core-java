package com.java.multi_threading;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemo_01 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
