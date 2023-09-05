package com.abstractfactory;

public class NotificationFactory {
	
public static Notification careateNotification(NotificationAbstractFactory abstractFactory) {
		
		return abstractFactory.careateNotification();
	}

}
