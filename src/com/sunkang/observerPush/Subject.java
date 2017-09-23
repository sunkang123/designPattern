/**
 * 
 */
package com.sunkang.observerPush;
/**
 * 主题对象(提供了注册和移除和通知的接口)
 *@author sunkang
 *@date 创建时间：2017年6月13日上午11:23:01
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
