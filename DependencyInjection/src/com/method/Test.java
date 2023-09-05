package com.method;
interface EmailSender{
  void send(String content, String reciver);	
}

class SMTPEmailSender implements EmailSender{

	@Override
	public void send(String content, String reciver) {
		
		System.out.println("Email Send to-"+reciver+ " Message - "+content);
		
	}
	
}

class EmailService{
	public static void sendEmail(String content, String reciver, EmailSender emailSender ) {
		emailSender.send(content, reciver);
	}
}
public class Test {
	
	public static void main(String[] args) {
	 EmailSender sender = 	new SMTPEmailSender();
		EmailService.sendEmail("Hello team", "Prince", sender);
	}

}
