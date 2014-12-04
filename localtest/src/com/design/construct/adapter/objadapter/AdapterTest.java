package com.design.construct.adapter.objadapter;
/**
 * 对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，
 * 可以创建一个Adapter类，持有原类的一个实例，在Adapter类的方法中，调用实例的方法就行。
 * @author Jason
 *
 */
public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source source = new Source();  
		Targetable t = new Adapter(source) ;
		t.method1(); 
		t.method2();
	}

}
