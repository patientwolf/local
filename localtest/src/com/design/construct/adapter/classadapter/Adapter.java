package com.design.construct.adapter.classadapter;
/**
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。
 * @author Jason
 *
 */
public class Adapter extends Source implements Targetable{

	
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is method2");
	}
	
}
