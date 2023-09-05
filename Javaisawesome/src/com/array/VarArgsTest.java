package com.array;

public class VarArgsTest {
	
	public static int addMethod(int ... a) {
		int sum = 0;
		for (int i : a) {
           sum += i; // sum  = sum +i;
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println(" Sum of addMethod(): " + addMethod());
		System.out.println(" Sum of addMethod(1): " + addMethod(1));
		System.out.println(" Sum of addMethod(1,2): " );
		System.out.println(" Sum of addMethod(1,2,3): " + addMethod(1, 2, 3));
		System.out.println(" Sum of addMethod(10,20,10,10,20): " + addMethod(10, 20, 10, 10, 20));

	}

}
