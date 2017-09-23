/**
 * 
 */
package com.sunkang.strategy;
/**
 * ���Ǻ�ͷѼ
 *@author sunkang
 *@date ����ʱ�䣺2017��6��13������10:20:33
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
		System.out.println("���Ǻ�ͷѼ");
	}

	public RedHeadDuck() {
		flyBehavior=new FlyWithWings();
		quackBehavior=new Quack();
	}
	
}
