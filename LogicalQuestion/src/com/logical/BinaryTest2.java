package com.logical;

public class BinaryTest2 {
	
	public static void main(String[] args) {
		
		String a   = "1001";
		String b   = "1101";
		
	    int aa = Integer.parseInt(a, 2);
	    System.out.println(aa);
	    
	    int bb = Integer.parseInt(b, 2);
	    System.out.println(bb);
	    
	    int sum  = aa+bb; //22
	    
	    String binaryString = Integer.toBinaryString(sum);
	    System.out.println(binaryString);
	    
	}

}
