/**
 * 
 */
package com.sunkang.factoryMethod;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��25������11:23:30
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class ChicagopizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new  ChicagoStyleCheesePizza();
		}else return null;
		
	}
	

}