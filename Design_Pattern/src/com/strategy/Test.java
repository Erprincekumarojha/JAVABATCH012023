package com.strategy;

public class Test {
	
	public static void main(String[] args) {
		
		DatabaseConnection connection = new DatabaseConnection(new MongoDB());
		connection.createDBConnection("http://localhost:4598/mydb", "Root", "123454");
	}

}
