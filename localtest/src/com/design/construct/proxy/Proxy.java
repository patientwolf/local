package com.design.construct.proxy;

public class Proxy implements IDBQuery{
	DBQueryImpl dbQuery = null ;
	@Override
	public String query() {
		//在真正需要的时候再创建对象
		if(dbQuery==null){
			dbQuery = new DBQueryImpl();
		}
		before();
		String result = dbQuery.query();
		after();
		return result ;
	}
	public void before() {
		System.out.println("可以再处理前调用，对原有方法进行控制");
	}
	public void after() {
		System.out.println("可以再处理后调用，对原有方法进行控制");
	}
}
