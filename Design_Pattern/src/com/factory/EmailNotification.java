package com.factory;

import java.util.List;

public class EmailNotification implements Notification{

	@Override
	public void sendNotification(List<String> users, String message) {
	
		 for(String user : users) {
			 
			 System.out.println("Send Email to: "+user+" - "+message);
		 }
		
	}
}
