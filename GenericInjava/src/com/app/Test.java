package com.app;

interface BackAccount<S>{
	
	
}
class Bank<T> {

	T value;

	public Bank(T d) {
		this.value = d;
	}

	public T getValue() {
		return this.value;
	}
}

public class Test {
	public static void main(String[] args) {

		Bank<String> bank = new Bank("Hello");
	}

}
