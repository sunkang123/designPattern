/**
 * 
 */
package com.sunkang.factoryMethod;
/**
 *@author sunkang
 *@date 创建时间：2017年6月25日下午11:23:30
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class NYpizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new  NYStyleCheesePizza();
		}else return null;
		
	}
	

}
