package com.thread;

public class ThreadTest implements Runnable{

	@Override
	public void run() {
		System.out.println("thread is started..........");
		
	}
	
	public static void main(String[] args) {
		
		ThreadTest t = new ThreadTest();
		Thread thread = new Thread(t);
		thread.start();// start method internally call run() method 
		
	}
	
	

}
