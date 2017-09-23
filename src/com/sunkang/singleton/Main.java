/**
 * 
 */
package com.sunkang.singleton;
/**
 * 
 *@author sunkang
 *@date 创建时间：2017年6月26日下午1:26:40
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 
 * 
 * 单例模式：确保一个类只有一个实例，并提供一个全局访问点
 */
public class Main {
	public static void main(String[] args) {
		Singleton1 singleton1=Singleton1.getInstance();
		Singleton2 singleton2=Singleton2.getInstance();
		Singleton3 singleton3=Singleton3.getInstance();
		Singleton4 singleton4=Singleton4.getInstance();
		System.out.println(singleton1+":"+singleton2+":"+singleton3+":"+singleton4);		
				
	}

}
