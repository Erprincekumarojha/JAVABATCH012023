package com.java;

public class Box<P> {

	 P data;
	 
	 public Box(P data){
		 this.data = data;
	 }
	 
	 public P getData() {
		 return this.data;
	 }
}
