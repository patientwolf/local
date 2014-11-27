package com.design.factory.abstractfactory;

public class MsnSender implements Sender {

	@Override
	public void sender() {
		System.out.println("msn send");
	}
	
}
