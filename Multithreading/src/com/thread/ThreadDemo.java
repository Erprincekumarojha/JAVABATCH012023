package com.thread;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {

		Thread.currentThread().setPriority(MAX_PRIORITY);

		ThreadDemo t1 = new ThreadDemo(); // those 3 thread is a child of main thread
		ThreadDemo t2 = new ThreadDemo();
		ThreadDemo t3 = new ThreadDemo();// always child having priority of parent thread.

		// thread 1
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());

		// let's change the priority of user define thread
		t1.setPriority(3);
		t2.setPriority(6);
		t3.setPriority(7);

		// thread 1
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		//print thread name with thread priority
		System.out.println(t1.getName()+ " "+t1.getPriority());
		System.out.println(t2.getName()+ " "+t2.getPriority());
		System.out.println(t3.getName()+ " "+t3.getPriority());
	}

}
