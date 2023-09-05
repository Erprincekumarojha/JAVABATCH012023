package com.strategy;

public class MysqlDB implements Database{

	@Override
	public void dbConnection(String url, String userid, String password) {
	
		//write a code to interact with DB
		System.out.println("Mysql DB connection is created successfully" + userid);
		
	}

}
