/**
 * 
 */
package com.sunkang.singleton;



/**
 * ����ģʽ���̲߳���ȫ��
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������1:11:47
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
