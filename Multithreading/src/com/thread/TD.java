package com.thread;

public class TD extends Thread {

	@Override
	public  void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "-" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		TD t1 = new TD();
		TD t2 = new TD();
		TD t3 = new TD();
      //  t2.setPriority(8);
		t1.start();
		t2.start();
		
	}

}
