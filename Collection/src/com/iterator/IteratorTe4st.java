package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTe4st {

	public static void main(String[] args) {

		ArrayList list = new ArrayList<>();
		list.add(10);
		list.add("java");
		list.add(50);
		list.add("is");
		list.add("awesome");

		// create iterator and traverse the Collection
		Iterator iterator = list.iterator();

		while (iterator.hasNext()) {
         if(iterator.next()==(Object)50 ) {
        	 iterator.remove();
        	 break;
         }
		}
		System.out.println(list);
	}

}
