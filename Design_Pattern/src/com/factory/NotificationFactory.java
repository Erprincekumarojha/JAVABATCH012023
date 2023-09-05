package com.factory;

public class NotificationFactory {
	
	public static Notification createNotification(String channel) {
	
		if(channel.equalsIgnoreCase("SMS")) {
			return new SMSNotification();
		}else if(channel.equalsIgnoreCase("PUSH")){
			return new PushNotification();
		}else if(channel.equalsIgnoreCase("EMAIL")) {
			return new EmailNotification();
		}else {
			return null;
		}
	}

}
