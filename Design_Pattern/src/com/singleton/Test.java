package com.singleton;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Singleton s1  = Singleton.getInstance();
		System.out.println(s1.hashCode());
		
        System.out.println("\n\n--------");
        //clone
        Singleton s2= (Singleton)s1.clone();
       
       
		System.out.println(s2.hashCode());
	}

}
