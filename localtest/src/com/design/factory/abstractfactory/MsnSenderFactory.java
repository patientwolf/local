package com.design.factory.abstractfactory;

public class MsnSenderFactory implements Provider {

	@Override
	public Sender produce() {
		return new MsnSender();
	}
	
}
