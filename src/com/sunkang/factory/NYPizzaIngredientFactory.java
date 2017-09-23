/**
 * 
 */
package com.sunkang.factory;
/**
 * 创建纽约原料的工厂
 * 创建具体的子类
 *@author sunkang
 *@date 创建时间：2017年6月26日上午12:02:47
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public  class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDouch() {
		//返回dough的子类
		return null;
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.sunkang.factory.PizzaIngredientFactory#createCheeses()
	 */
	@Override
	public Cheese[] createCheeses() {
		// TODO Auto-generated method stub
		return null;
	}

}
