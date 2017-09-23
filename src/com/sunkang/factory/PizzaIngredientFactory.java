/**
 * 
 */
package com.sunkang.factory;
/**
 *@author sunkang
 *@date 创建时间：2017年6月25日下午11:57:57
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
