package com.fi;

public class RunnableTest {

	public static void main(String[] args) {

		Runnable run = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};
		
		Thread t  =new Thread(run);
		t.start();
	}

}
