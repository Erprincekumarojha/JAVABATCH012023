package com.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {

		ArrayList list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(100);
		list.add(200);

		// create Listiterator and traverse the Collection
		ListIterator listIterator = list.listIterator();

		// forward Direction iteration
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
          System.out.println("----------------");
		// Backward Direction iteration
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		// remove and add some element
		while (listIterator.hasNext()) {
			if(listIterator.next()==(Object)10) {
				listIterator.remove();
				listIterator.add(40);
				
			}
		}
		
		System.out.println(list);
	}

}
