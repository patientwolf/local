package com.design.factory.builder;

public class ManBuilder implements Builder{

	Person person ;
	public ManBuilder(){
		person = new Man() ;
	}
	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("head");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("body");
	}

	@Override
	public void buildHand() {
		// TODO Auto-generated method stub
		person.setHand("hand");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("foot");
	}

	@Override
	public Person buildPerson() {
		// TODO Auto-generated method stub
		return person;
	}
	
}
