package com.design.construct.adapter.classadapter;
/**
 * 适配器模式——类的适配
 * 
 * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，
 * 创建一个新类，继承原有的类，实现新的接口即可。
 * 
 * 待适配的类
 * @author Jason
 *
 */
public class Source {
	public void method1() {
		System.out.println("this is old method1");
	}
}
