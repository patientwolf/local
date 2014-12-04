package com.design.construct.proxy;

import java.text.ParseException;

/**
 * 代理模式——实现缓加载、并可以对对原有的方法控制
 * @author Jason
 *
 */
public class TestProxy {

	public static void main(String[] args) throws ParseException {
		IDBQuery iqry =  new Proxy() ; //使用代理
		iqry.query() ; //在真正使用时才创建真实对象
		

	}


}
