/**
 * 
 */
package com.sunkang.decorator;
/**
 *Ũ����
 *@author sunkang
 *@date ����ʱ�䣺2017��6��25������9:36:43
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Expresso extends Beverage{
	
	
	
	public Expresso() {
		description="Expresso coffee";
	}

	@Override
	public double cost() {
		return 1.98;
	}
	

}
