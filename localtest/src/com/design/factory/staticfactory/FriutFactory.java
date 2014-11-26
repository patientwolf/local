package com.design.factory.staticfactory;
/**
 * π§≥ß¿‡
 * @author Jason
 *
 */
public class FriutFactory {
	
	public static Friut getFriut(String type) {
		Friut f = null ;
		try {
			f = (Friut) Class.forName("com.design.factory.staticfactory."+type).newInstance() ;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f ;
	}
}
