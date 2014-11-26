package com.design.factory.staticfactory;
/**
 * 静态工厂测试类
 */
public class TestStaticFactory {
	public static void main(String args[]) {
		
		Friut f = FriutFactory.getFriut("Grape") ;
		if(f!=null){
			f.say(); 
		} else {
			System.out.println("no such friut");
		}
	}
}
