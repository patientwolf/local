package com.design.factory.singleton;
/**
 * 单例模式
 * 目前比较完善的一个实现
 * @author Jason
 *
 */
public class Singleton {
	
	/**私有构造方法*/
	private  Singleton(){
		System.out.println("单例构造方法");
	}
	/**使用内部类维护单例
	 * 线程友好
	 * 当Singleton被加载，内部类不会被初始化
	 * */
	private static class SingletonHolder{
		private static Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance(){
		return SingletonHolder.instance ;
	}
	/**
	 * 当JVM从内存中反序列化地"组装"一个新对象时
	 * 会自动调用readResolve方法来返回指定好的对象
	 * 单例规则得到了保证
	 * @return
	 */
	private Object readResolve() {
        return getInstance();  
    } 
}
