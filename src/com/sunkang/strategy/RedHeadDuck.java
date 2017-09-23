/**
 * 
 */
package com.sunkang.strategy;
/**
 * 我是红头鸭
 *@author sunkang
 *@date 创建时间：2017年6月13日上午10:20:33
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class RedHeadDuck extends Duck{

	/* (non-Javadoc)
	 * @see com.sunkang.strategy.Duck#dispaly()
	 */
	@Override
	public void dispaly() {
		System.out.println("我是红头鸭");
	}

	public RedHeadDuck() {
		flyBehavior=new FlyWithWings();
		quackBehavior=new Quack();
	}
	
}
