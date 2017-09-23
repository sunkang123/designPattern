/**
 * 
 */
package com.sunkang.simpleFactory;


/**
 *@author sunkang
 *@date 创建时间：2017年6月25日下午10:38:01
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class PizzStore {
	
	SimplePizzaFactory factory;
	
	public PizzStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza=factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	
	

}
