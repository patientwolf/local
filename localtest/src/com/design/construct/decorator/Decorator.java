package com.design.construct.decorator;
/**
 * 装饰者类，不同装饰者可以有N个装饰类
 * @author Jason
 *
 */
public class Decorator implements Sourceable{
	
	private Sourceable source ;
	
	public Decorator(Sourceable source){
		super();
		this.source = source ;
	}
	/**
	 * 被装饰的method1方法
	 */
	@Override
	public void method1() {
		System.out.println("before decorator! do something");  
		//此处调用被装饰对象的方法
		source.method1();
		System.out.println("after decorator! do something");  
	}
	
}
