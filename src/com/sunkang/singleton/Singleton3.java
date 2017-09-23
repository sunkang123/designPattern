/**
 * 
 */
package com.sunkang.singleton;
/**
 * ˫�ؼ�����ģʽ   ���߳� ��ȫ��
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������1:16:32
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Singleton3 {
private volatile static Singleton3 instance;
	
	private Singleton3(){};
	
	public  static Singleton3 getInstance(){
		if(instance==null){//���ʵ��
			synchronized (Singleton3.class) {
				if(instance==null){  //ֻҪ��һ�β�ִ������Ĵ���
					instance=new Singleton3();
				}
			}
		}
		return instance;
	}

}
