/**
 * 
 */
package com.sunkang.observerPush;
/**
 * �������(�ṩ��ע����Ƴ���֪ͨ�Ľӿ�)
 *@author sunkang
 *@date ����ʱ�䣺2017��6��13������11:23:01
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
