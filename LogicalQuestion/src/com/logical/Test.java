package com.logical;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
	   List<Integer> list = new ArrayList<>();
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   
	   for(Integer i : list) {
		 System.out.println(i);   
	   }
	   
	}
	
	public static <T> T getData(List<T> list){
		return list.get(0);
	}

}
