/**
 * 
 */
package com.sunkang.factory;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������12:09:21
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class CheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
	}
	void prepare(){
		System.out.println("preparing "+name);
		dough=ingredientFactory.createDouch();
		sauce=ingredientFactory.createSauce();
		
	}
	

}
