package com.synch;


public class TestJoin extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 1; i <=5; i++) {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+" - "+Thread.currentThread().getName());
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		TestJoin t1 = new TestJoin();
		TestJoin t2 = new TestJoin();
		TestJoin t3 = new TestJoin();
		
		t1.start();
		//t1.join(); // wait unit t1 will complete or die
		t1.join(20000,345435); // after starting the execution of t1 thread,you have join  in 5 sec 
		t2.start();
		t3.start();
		
	}
	
}
