package com.design.factory.builder;
/**
 * 
 * @author Jason
 *
 */
public class TestBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDirector pd = new PersonDirector();  
        Person person = pd.ConstructPerson(new ManBuilder());  
        System.out.println(person.getHead());  
        System.out.println(person.getBody());  
        System.out.println(person.getHand());  
        System.out.println(person.getFoot());  
	}

}
