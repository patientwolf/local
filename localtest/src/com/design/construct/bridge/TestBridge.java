package com.design.construct.bridge;
/**
 * Bridge模式是一种抽象与其实现相分离的模式。
 * 
 * 它主要应用于：当事物是一组变化量，
 * 和对这些事物的操作方法(实现)也是一组变化量的情况，也就是说它们都是多变的。
 * @author Jason
 *
 */
public class TestBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine1500 = new Engine1500CC();
        Engine engine2200 = new Engine2200CC();
       
        Vehicle bus1500 = new Bus( engine1500 );
        Vehicle bus2200 = new Bus( engine2200 );
        bus1500.setEngine();
        bus2200.setEngine();
       
        Vehicle truck1500 = new Truck( engine1500 );
        Vehicle truck2200 = new Truck( engine2200 );
        truck1500.setEngine();
        truck2200.setEngine();
	}

}
