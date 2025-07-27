package com.java.multi_threading;

class MyThread2 extends Thread {

}

public class Getting_Setting_Name_04 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread my = new MyThread();
		System.out.println(my.getName());
		Thread.currentThread().setName("Aman");
		System.out.println(Thread.currentThread().getName());

	}

}
