/**
 * 
 */
package com.sunkang.decorator;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��25������9:40:16
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Wich extends CondimentDecorator {
	private Beverage beverage;
	public Wich(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		
		return beverage.getDescription()+",wich";
	}
	@Override
	public double cost() {
		return beverage.cost()+0.10;
	}

}
