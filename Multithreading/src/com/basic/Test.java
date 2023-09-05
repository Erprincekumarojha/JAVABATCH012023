package com.basic;
interface Message{
	String message(String msg);
}
public class Test {

	public static void main(String[] args) {

		Message msg1 = (msg) -> "TutorialsPoint " + msg;
		System.out.println(msg1.message("Hello"));
	}

}
