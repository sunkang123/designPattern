/**
 * 
 */
package com.sunkang.factoryMethod;


/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��25������10:38:01
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public abstract class PizzaStore {
	
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	protected abstract Pizza createPizza(String type);
}
