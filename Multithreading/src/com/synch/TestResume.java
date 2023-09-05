package com.synch;

public class TestResume extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+ " - "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) throws InterruptedException {

		TestResume t1 = new TestResume();
		TestResume t2 = new TestResume();
		TestResume t3 = new TestResume();
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		System.out.println("B- "+t2.isAlive());
		t1.start();
		t2.start();
		t3.start();
		System.out.println("B- "+t2.isAlive());
		t2.suspend(); // t2 thread execution will stop
		System.out.println("B- "+t2.isAlive());
		Thread.sleep(14000);
		
		t2.resume(); // restart the t2 thread again
		System.out.println("B- "+t2.isAlive());
	}

}
