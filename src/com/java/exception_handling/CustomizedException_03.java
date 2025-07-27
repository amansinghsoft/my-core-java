package com.java.exception_handling;

class TooYoungException extends RuntimeException{
	TooYoungException(String s){
		super(s);
	}
}

class TooOldException extends RuntimeException{
	TooOldException(String s){
		super(s);
	}
}
public class CustomizedException_03 {

	public static void main(String[] args) {
		int age=12;
		if(age>60) {
			throw new TooYoungException("You are too young");
		}else if(age<18) {
			throw new TooOldException("You are already crossed marriage");
		}else {
			System.out.println("You will get match soon!!!");
		}

	}

}
