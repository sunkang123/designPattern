/**
 * 
 */
package com.sunkang.strategy;
/**
 * ���ó���
 *@author sunkang
 *@date ����ʱ�䣺2017��6��13������10:10:37
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
		System.out.println("�ҿ����ó���");
	}
	
	

}
