package com.design.factory.builder;

public interface Builder {  
	  
    public void buildHead();  
  
    public void buildBody();  
  
    public void buildHand();  
  
    public void buildFoot();  
  
    public Person buildPerson();  
}
