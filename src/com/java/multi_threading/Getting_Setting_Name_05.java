package com.java.multi_threading;

class MYThread extends Thread {
	public void run() {
		System.out.println("run() method executed by Thread : " + Thread.currentThread().getName());
	}
}

public class Getting_Setting_Name_05 {

	public static void main(String[] args) {
		MYThread my = new MYThread();
		my.start();
		System.out.println("main() method executed by Thread : " + Thread.currentThread().getName());

	}

}
