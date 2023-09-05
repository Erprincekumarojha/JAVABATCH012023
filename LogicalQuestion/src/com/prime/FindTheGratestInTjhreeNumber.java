package com.prime;

public class FindTheGratestInTjhreeNumber {
	
	public static void main(String[] args) {
		int a = 100, b = 60, c = 40;
		if(a<b && c<b ) {
			System.out.println("b is grater");
		}else if(a<c && b<c) {
			System.out.println("c is grater");
		}else if(a==b && b==c) {
			System.out.println("a is grater");
		}
	}

}
