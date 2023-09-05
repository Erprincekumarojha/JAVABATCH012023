package com.abstractfactory;

public class SMSFactory extends NotificationAbstractFactory{

	@Override
	public Notification careateNotification() {
		
		return new SMSNotification();
	}

}
