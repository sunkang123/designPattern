/**
 * 
 */
package com.sunkang.factoryMethod;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��25������11:16:19
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
