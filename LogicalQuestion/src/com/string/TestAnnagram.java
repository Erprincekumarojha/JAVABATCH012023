package com.string;

import java.util.Arrays;

public class TestAnnagram {

	public static void main(String[] args) {
		
		String s1 = "abcd"; //abcd
		String s2 = "dcfa"; // abcd
		
		if(s1.length()!=s2.length()) {
			System.out.println("Both string are not a annagram");
			System.exit(0);
		}
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
	    int i=0 ;
	    boolean status = false;
	    while(i<arr2.length) {
	    	if(arr1[i]!=arr2[i]) {
	    	  status = true;
	    	  break;
	    	}
	    	i++;
	    }
	    
	    if(status) {
	    	System.out.println("Both string are not a annagram");
	    }else {
	    	System.out.println("String are annagram");
	    }
		
		
	}
}


