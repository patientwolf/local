package com.design.construct.decorator;
/**
 * 装饰者模式
 * Java 的I/O API就是使用Decorator实现的
 * 
 * 动态给一个对象添加一些额外的职责,就象在墙上刷油漆.使用Decorator模式相比用生成子类方式达到功能的扩充显得更为灵活
 * 
 * 通常可以使用继承来实现功能的拓展,如果这些需要拓展的功能的种类很繁多,那么势必生成很多子类,增加系统的复杂性,
 * 同时,使用继承实现功能拓展,我们必须可预见这些拓展功能,这些功能是编译时就确定了,是静态的。
 * @author Jason
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Sourceable source = new Source(); 
		Sourceable obj = new Decorator(source);
		obj.method1(); 
	}

}
