package com.design.factory.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 原型模式
 * 该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 * 需要实现Clonable接口，覆写clone方法
 * @author Jason
 *
 */
public class Prototype implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	private String str ;
	private SerializableObject obj;  
	/**
	 * 浅复制(影子复制)
	 * 
	 * 适用于vo为简单基本类型包括string的vo复制都会重新创建
	 * 而引用类型，指向的还是原对象所指向的。
	 */
	@Override
	public Object clone()  {
		Prototype p = null ;
		try {
			p =(Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p ;
	}
	/**
	 * 深复制
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws IOException, ClassNotFoundException {
		/* 写入当前对象的二进制流 */  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
  
        /* 读出二进制流产生的新对象 */  
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return ois.readObject();  
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
	
	
	
	
	
}
