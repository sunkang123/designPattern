/**
 * 
 */
package com.sunkang.factory;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��25������11:57:57
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public interface PizzaIngredientFactory {
	public Dough createDouch();
	public Sauce createSauce();
	public Cheese[] createCheeses();
	public Clams createClam();

}
