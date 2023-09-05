package com.logical;

public class BinaryTest {
  //binary 0 & 1
//..... 64 32 16 8 4 2 1
// 5(integer | Decimal) -- 1 0 1 (Binary)
// 2)5(2 - 1,   2)2(1 -0   1%2 = 1   - 101
//	----------------------------------
	
	public static void main(String[] args) {
		String binary  = "";//101
		int n= 17; // convert to binary
		int c = n;
		while(n!=0) {
			int rem  =  n%2;
			binary = rem+binary;
			n =  n/2;
		}
		System.out.println(c+" binary is : "+binary);
	}
}
