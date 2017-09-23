/**
 * 
 */
package com.sunkang.decorator;
/**
 *@author sunkang
 *@date 创建时间：2017年6月25日下午9:38:46
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class HouseBlend extends Beverage {


	public HouseBlend() {
		description=" house blend coffee ";
	}

	@Override
	public double cost() {
		return 0.89;
	}
	

}
