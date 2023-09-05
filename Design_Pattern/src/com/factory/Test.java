package com.factory;

import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		Notification notification = NotificationFactory.createNotification("sms");
		if(notification!=null) {
			notification.sendNotification(List.of("prince","Akash", "sonu"), " your course is completed");
		}
		
		Notification notification1 = NotificationFactory.createNotification("email");
		if(notification1!=null) {
			notification1.sendNotification(List.of("prince","Akash", "sonu"), " your course is completed");
		}
		
		Notification notification2 = NotificationFactory.createNotification("push");
		if(notification2!=null) {
			notification2.sendNotification(List.of("prince","Akash", "sonu"), " your course is completed");
		}
	}

}
