/**
 * 
 */
package com.sunkang.strategy;
/**
 *@author sunkang
 *@date 创建时间：2017年6月13日上午10:17:23
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Quack implements QuackBehavior{

	/* (non-Javadoc)
	 * @see com.sunkang.strategy.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		System.out.println("可以呱呱叫");
		
	}

}
