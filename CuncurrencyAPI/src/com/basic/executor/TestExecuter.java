package com.basic.executor;

import java.util.concurrent.Executor;

class Invoker implements Executor{

	@Override
	public void execute(Runnable runnable) {
		runnable.run();		
	}
	
}
public class TestExecuter {

	public static void main(String[] args) {
		
		Executor executor = new Invoker();
		executor.execute(()->{
			System.out.println("Java is Awesome");
		});
	}
}
