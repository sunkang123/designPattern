/**
 * 
 */
package com.sunkang.singleton;
/**
 * 
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������1:26:40
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 
 * 
 * ����ģʽ��ȷ��һ����ֻ��һ��ʵ�������ṩһ��ȫ�ַ��ʵ�
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
