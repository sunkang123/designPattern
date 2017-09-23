/**
 * 
 */
package com.sunkang.singleton;



/**
 * 饱汉模式（线程不安全）
 *@author sunkang
 *@date 创建时间：2017年6月26日下午1:11:47
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Singleton1 {
	private static Singleton1 instance;
	
	private Singleton1(){};
	
	public static Singleton1 getInstance(){
		if(instance==null){
			instance=new Singleton1();
		}
		return instance;
	}
	
	
}
