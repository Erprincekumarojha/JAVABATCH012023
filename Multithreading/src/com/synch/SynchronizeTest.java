package com.synch;

class Count {

	// if you use synchronize then only once by one thread will execute
	public void count(int n) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i * n); // synchronize block make some line of code like thread safe
				// then use synchronized block
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

class MyThread1 extends Thread {
	Count c;

	public MyThread1(Count c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.count(1);
	}
}

class MyThread2 extends Thread {
	Count c;

	public MyThread2(Count c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.count(10);
	}
}

public class SynchronizeTest {

	public static void main(String[] args) {

		Count c = new Count();
		MyThread1 t1 = new MyThread1(c);
		MyThread2 t2 = new MyThread2(c);
		t1.start();
		t2.start();
	}

}
