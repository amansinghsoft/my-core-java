package com.java.multi_threading;

class MyThread9 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Sita Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class Join_01_09 {

	public static void main(String[] args) throws InterruptedException {

		MyThread9 my = new MyThread9();
		my.start();
		my.join();

		for (int i = 0; i < 10; i++) {
			System.out.println("Ram Thread");
		}
	}

}
