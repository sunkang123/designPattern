/**
 * 
 */
package com.sunkang.singleton;
/**
 * ��̬�ڲ���ģʽ���̰߳�ȫ�ģ����ﵽ�����ص�Ч����
 * ������Singleton.getInstance()�Ͳ��ᴴ��ʵ����
 * �ﵽ��lazy loading��Ч���������贴��ʵ����
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������1:21:27
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Singleton4 {
	
	private Singleton4(){};
	 private static class SingletonHolder{
	        private final static Singleton4 instance=new Singleton4();
	    }
    public static Singleton4 getInstance(){
        return SingletonHolder.instance;
    }
	

}
