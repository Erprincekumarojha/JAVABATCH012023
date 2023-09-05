package com.app;

enum TestEnum {
	
		MONDAY;
		
		public static void data() {
			System.out.println("My enum method");
		}
		
		private TestEnum() {
			System.out.println("Constructor of enum");
		}
		
		public static void main(String[] args) {
		 // TestEnum t = new Test(); we can't create object for that enum
			TestEnum.data();
			
			
		}
	

}
