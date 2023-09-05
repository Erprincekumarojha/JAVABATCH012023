package com.abstractfactory;

public class EmailFactory extends NotificationAbstractFactory{

	@Override
	public Notification careateNotification() {
		
		return new EmailNotification();
	}

}
