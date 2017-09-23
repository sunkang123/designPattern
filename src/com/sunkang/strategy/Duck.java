/**
 * 
 */
package com.sunkang.strategy;
/**
 * ������duck
 *@author sunkang
 *@date ����ʱ�䣺2017��6��13������10:06:24
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void swim(){
		System.out.println("���е�Ѽ�ӻ���Ӿ");
	}
	
	public abstract void dispaly();
	
	public void perfromFly(){
		flyBehavior.fly();
	}
	public void perfromQuack(){
		quackBehavior.quack();
	}
	/**������Ըı�Ѽ�ӷɺ�Ѽ�ӽе���Ϊ*/
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
