package com.design.factory.abstractfactory;

public class MailSender implements Sender {

	@Override
	public void sender() {
		System.out.println("mail send");
	}
	
}
