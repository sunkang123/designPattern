/**
 * 
 */
package com.sunkang.adapter;
/**
 *@author sunkang
 *@date 创建时间：2017年6月27日下午11:35:49
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class MallardDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("quack");
	}
	@Override
	public void fly() {
		System.out.println("i am fly");
	}

}
