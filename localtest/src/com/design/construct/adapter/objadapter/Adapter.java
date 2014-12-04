package com.design.construct.adapter.objadapter;
/**
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。
 * @author Jason
 *
 */
public class Adapter extends Source implements Targetable{

	private Source source ;
	
	public Adapter(Source source) {
		super();
		this.source = source ;
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is method2");
	}
	@Override
	public void method1() {
		source.method1();	
	}
	
}
