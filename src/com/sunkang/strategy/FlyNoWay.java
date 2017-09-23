/**
 * 
 */
package com.sunkang.strategy;
/**
 *@author sunkang
 *@date 创建时间：2017年6月13日上午10:12:24
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class FlyNoWay implements FlyBehavior{

	/* (non-Javadoc)
	 * @see com.sunkang.strategy.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("我什么也不会飞");
	}

	
}
