/**
 * 
 */
package com.sunkang.factoryMethod;
/**
 *@author sunkang
 *@date 创建时间：2017年6月25日下午11:16:19
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		name="chicago style and cheese pizza";
		dough="thin crust dough";
		sauce="marinara sauce";
		toppings.add("grated regginano cheese");
	}
	void cut(){
		System.out.println("cutting the pizza into square slices");
	}

}
