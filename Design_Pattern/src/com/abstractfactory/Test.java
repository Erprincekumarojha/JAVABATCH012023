package com.abstractfactory;

import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		Notification notification = NotificationFactory.careateNotification(new EmailFactory());
		notification.sendNotification(List.of("Raju", "Sonu", "Ajay"), " How are you team");
	}

}
