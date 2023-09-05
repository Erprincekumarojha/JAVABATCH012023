package com.thread;

public class MyThread extends Thread {

	@Override
	public void run() { // running state of thred
		System.out.println("thread is started ............");
		for (int i = 0; i < 10; i++) {
			System.out.println("userthred- " + i);
			try {
				Thread.sleep(5000);// 1000ms = 1s, 2000 ms - 2s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		MyThread t = new MyThread();// thread is created new state
		t.start(); // start state of thred
		t.setName("userthred");
		String name = t.getName();
		System.out.println(t.getId());
		System.out.println(name);
	}

}
