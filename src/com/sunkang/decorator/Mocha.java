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
public class Mocha extends CondimentDecorator {
	private Beverage beverage;
	
	
	public Mocha(Beverage beverage) {
		super();
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		
		return beverage.getDescription()+",mocha";
	}
	@Override
	public double cost() {
		return beverage.cost()+0.20;
	}

}
