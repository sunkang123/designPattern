/**
 * 
 */
package com.sunkang.singleton;
/**
 * ����ģʽ  ���̰߳�ȫ�ģ�
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������1:15:52
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
