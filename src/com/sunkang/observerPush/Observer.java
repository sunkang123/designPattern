/**
 * 
 */
package com.sunkang.observerPush;
/**
 * 观察者接口
 *@author sunkang
 *@date 创建时间：2017年6月13日上午11:25:31
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public interface Observer {
	public void update(float temp,float humidity,float pressure);
}
