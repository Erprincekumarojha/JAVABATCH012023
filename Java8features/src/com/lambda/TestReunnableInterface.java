package com.lambda;

public class TestReunnableInterface {
	
	static Runnable r = () -> {
		System.out.println("Run method");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	};

	public static void main(String[] args) {

		Thread th = new Thread(r);
		th.start();

	}

}
