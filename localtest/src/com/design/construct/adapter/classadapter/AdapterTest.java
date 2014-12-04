package com.design.construct.adapter.classadapter;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Targetable t = new Adapter() ;
		t.method1(); 
		t.method2();
	}

}
