/**
 * 
 */
package com.sunkang.decorator;
/**
 *浓咖啡
 *@author sunkang
 *@date 创建时间：2017年6月25日下午9:36:43
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
