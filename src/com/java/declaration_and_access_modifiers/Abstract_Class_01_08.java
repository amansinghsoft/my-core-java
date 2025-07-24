package com.java.declaration_and_access_modifiers;

abstract class Person {
	String name;
	int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
}

class Student extends Person {
	int rollNo;

	public Student(String name, int age, int rollNo) {
		super(name, age);
		this.rollNo = rollNo;
	}

}

public class Abstract_Class_01_08 {
	public static void main(String[] args) {
		Student s = new Student("AMan", 34, 89);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.rollNo);
	}
}
