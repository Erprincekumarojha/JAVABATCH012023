package com.factory;

import java.util.List;

public class SMSNotification implements Notification{

	@Override
	public void sendNotification(List<String> users, String message) {
	
		 for(String user : users) {
			 
			 System.out.println("Send SMS to: "+user+" - "+message);
		 }
		
	}

}
