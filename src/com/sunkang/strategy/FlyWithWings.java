/**
 * 
 */
package com.sunkang.strategy;
/**
 * 飞用翅膀飞
 *@author sunkang
 *@date 创建时间：2017年6月13日上午10:10:37
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class FlyWithWings  implements FlyBehavior{

	/* (non-Javadoc)
	 * @see com.sunkang.strategy.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("我可以用翅膀飞");
	}
	
	

}
