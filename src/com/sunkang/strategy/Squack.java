/**
 * 
 */
package com.sunkang.strategy;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��13������10:18:15
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Squack implements QuackBehavior {

	/* (non-Javadoc)
	 * @see com.sunkang.strategy.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		System.out.println("����֨֨��");
		
	}

	
}
