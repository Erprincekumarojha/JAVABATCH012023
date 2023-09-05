package com.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class CollectionTest {
	
	public static void main(String[] args) {
		//Object only
		/*
		 * ArrayList a = new ArrayList(); a.add(10); a.add(20);// auto resizable |
		 * growable in nature //a.remove(1); System.out.println(a.get(0));//fast random
		 * access System.out.println(a.get(1)); System.out.println(a);
		 */
		
		/*
		 * LinkedList<Object> l = new LinkedList<Object>(); l.add(10); l.add(30);
		 * l.add(60); l.addFirst(5); l.addLast(1); l.add("java is awesome");
		 * 
		 * System.out.println(l);
		 */
		
		/*
		 * Vector v= new Vector<>(); v.add(10); v.add("java"); v.add(23.467);
		 * v.remove(0); System.out.println(v.size()); System.out.println(v);
		 */
		
		Stack s  =new Stack();// First in Last Out
		s.push(10);
		s.push(20);
		s.push(30);
		
		s.pop();
		System.out.println(s);
		
		
	}

} 
