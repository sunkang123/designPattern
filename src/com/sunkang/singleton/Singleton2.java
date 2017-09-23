/**
 * 
 */
package com.sunkang.singleton;
/**
 * 饿汉模式  （线程安全的）
 *@author sunkang
 *@date 创建时间：2017年6月26日下午1:15:52
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Singleton2 {
	private static Singleton2 instance;
	
	private Singleton2(){};
	
	public static Singleton2 getInstance(){
		return instance;
	}
	

}
