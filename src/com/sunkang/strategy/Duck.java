/**
 * 
 */
package com.sunkang.strategy;
/**
 * 抽象类duck
 *@author sunkang
 *@date 创建时间：2017年6月13日上午10:06:24
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void swim(){
		System.out.println("所有的鸭子会游泳");
	}
	
	public abstract void dispaly();
	
	public void perfromFly(){
		flyBehavior.fly();
	}
	public void perfromQuack(){
		quackBehavior.quack();
	}
	/**加入可以改变鸭子飞和鸭子叫的行为*/
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
