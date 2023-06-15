package com.synch;

class IncreemntCount{
	 volatile  int count = 0;
	
	public int getCount() {
		return this.count;
	}
	
	public void increment(int n) {
		this.count= this.count+n;
	}
}

class MyTestThread1 extends Thread{
	IncreemntCount increemntCount;
	public MyTestThread1(IncreemntCount c) {
		this.increemntCount=c;
	}
	@Override
	public void run() {
	 int count = increemntCount.getCount();
	 System.out.println(Thread.currentThread().getName() +" old value of count : "+count);	
	 //increment count value by 1
	 increemntCount.increment(1);
	 //read count value & print
	 count = increemntCount.getCount();
	 System.out.println(Thread.currentThread().getName() +" new value of count : "+count);
	 
	}
}

class MyTestThread2 extends Thread{
	IncreemntCount increemntCount;
	public MyTestThread2(IncreemntCount c) {
		this.increemntCount=c;
	}
	@Override
	public void run() {
	 int count = increemntCount.getCount();
	 System.out.println(Thread.currentThread().getName() +" old value of count : "+count);	
	 //increment count value by 1
	 increemntCount.increment(1);
	 //read count value & print
	 count = increemntCount.getCount();
	 System.out.println(Thread.currentThread().getName() +" new value of count : "+count);
	 
	}
}


public class VolatileTest {
	
	public static void main(String[] args) {
		
		IncreemntCount c = new IncreemntCount();
		MyTestThread1 t1 = new MyTestThread1(c);
		MyTestThread2 t2 = new MyTestThread2(c);
		t1.start();
		t2.start();
	}

}
