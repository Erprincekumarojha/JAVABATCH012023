package com.thread;

public class MyThreadClass extends Thread{
	
	@Override
	public void run() {
	   System.out.println("Thread: ID-"+Thread.currentThread()
	   .getId()+", Name -"+Thread.currentThread().getName()+ " running");	
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		for(int i=1 ; i<=10; i++) { // 10 thread i am going to create
			MyThreadClass mt = new MyThreadClass();
			mt.start();
			Thread.sleep(1000);
		}
		
	}

}
