package com.design.factory.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		Provider provider = new MailSenderFactory() ;
		Sender sender = provider.produce() ;
		sender.sender(); 
	}

}
