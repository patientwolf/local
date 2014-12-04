package com.design.construct.proxy;

public class DBQueryImpl implements IDBQuery {
	
	public DBQueryImpl(){
		System.out.println("若为重量级对象，包含很多逻辑数据库连接耗时操作，可以通过代理模式延迟加载");
	}

	@Override
	public String query() {
		// TODO Auto-generated method stub
		System.out.println("查询数据库操作");
		return null;
	}
	
}
