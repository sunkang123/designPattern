/**
 * 
 */
package com.sunkang.simpleFactory;


/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��25������10:38:01
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
