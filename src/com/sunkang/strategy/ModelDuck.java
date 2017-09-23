/**
 * 
 */
package com.sunkang.strategy;
/**
 * 模型鸭不会飞,只能吱吱叫
 *@author sunkang
 *@date 创建时间：2017年6月13日上午10:15:14
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class ModelDuck extends Duck{

	/* (non-Javadoc)
	 * @see com.sunkang.strategy.Duck#dispaly()
	 */
	@Override
	public void dispaly() {
		System.out.println("我是模型鸭");
	}

	public ModelDuck() {
		flyBehavior=new FlyNoWay();
		quackBehavior=new Squack();
	}
	
	
	

}
