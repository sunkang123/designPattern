/**
 * 
 */
package com.sunkang.strategy;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��13������10:17:23
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
		System.out.println("�������ɽ�");
		
	}

}
