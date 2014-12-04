package com.design.construct.facade;
/**
 * 外观模式
 * 
 * 外观模式是为了解决类与类之家的依赖关系的，像spring一样，
 * 可以将类和类之间的关系配置到配置文件中，而外观模式就是将他们的关系放在一个Facade类中，
 * 降低了类类之间的耦合度
 * @author Jason
 *
 */
public class TestFacade {
	public static void main(String args[]) {
		Computer c = new Computer() ;
		c.startup();
		c.shutdown();
	}
}
