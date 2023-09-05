package com.app;

public class ForLoopTest {

	public static void main(String[] args) {
		
		 //1+2+3+4+5+6 ......................10000
         // 1 3 6  ...... 
		int sum = 0;
		for( int n = 1;   n<=10000    ;    n = n+1  ) {
          
          sum  = sum + n;
         
	    }
		
		System.out.println(sum);
		
	}
}
