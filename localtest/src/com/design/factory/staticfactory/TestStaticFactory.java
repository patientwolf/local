package com.design.factory.staticfactory;
/**
 * ��̬������ʹ��
 */
public class TestStaticFactory {
	public static void main(String args[]) {
		
		Friut f = FriutFactory.getFriut("Grape") ;
		if(f!=null){
			f.say(); 
		} else {
			System.out.println("û�д���ˮ��");
		}
	}
}
