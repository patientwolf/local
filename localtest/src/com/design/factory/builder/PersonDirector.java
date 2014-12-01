package com.design.factory.builder;

public class PersonDirector {
	//指挥创建  
    public Person ConstructPerson(Builder b)  
    {          
        b.buildFoot();  
        b.buildHand();  
        b.buildHead();  
        b.buildBody();  
        return b.buildPerson();  
    } 
}
