package com.design.construct.bridge;
/**
 * 汽车抽象类的子类——卡车
 */
public class Bus extends Vehicle {

	Bus(Engine engine) {
		super(engine);
	}

	@Override
	public void setEngine() {
		// TODO Auto-generated method stub
		super.getEngine().setEngine();
	}
	
}
