/**
 * 
 */
package com.sunkang.strategy;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��13������10:12:24
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
		System.out.println("��ʲôҲ�����");
	}

	
}
