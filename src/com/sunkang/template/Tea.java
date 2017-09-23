/**
 * 
 */
package com.sunkang.template;
/**
 *@author sunkang
 *@date 创建时间：2017年6月28日下午8:44:55
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Tea extends CaffeineBeverageWithHook{

	@Override
	void brew() {
	System.out.println("浸泡茶叶");	
	}

	@Override
	void addCondiments() {
		System.out.println("加入柠檬");
	}

}
