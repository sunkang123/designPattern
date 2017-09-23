/**
 * 
 */
package com.sunkang.adapter;
/**
 *@author sunkang
 *@date 创建时间：2017年6月27日下午11:37:23
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class WildTurkey implements Turkey{
	@Override
	public void gobble() {
		System.out.println("gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("i am flying a short distance");
	}

}
