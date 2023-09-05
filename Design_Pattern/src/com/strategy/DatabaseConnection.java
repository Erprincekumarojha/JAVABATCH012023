package com.strategy;

public class DatabaseConnection {
	
	private Database database;
	
	public DatabaseConnection(Database database) {
		this.database = database;
	}
	
	public void createDBConnection(String url, String userId, String password) {
	  database.dbConnection(url, userId, password);	
	}

}
