/**
 * 
 */
package com.sunkang.factory;
/**
 *@author sunkang
 *@date 创建时间：2017年6月26日上午12:14:00
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 工厂方法创建对象需要拓展一个类，并覆盖它的工厂方法，用的是继承
 * 
 * 抽象工厂 需要实现接口，创建整个产品家族，通过对象的组合。
 * 
 * 抽象工厂模式：提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类
 * PizzaIngredientFactory  接口工厂
 * Cheese  具体产品实现
 */
public class Main {
	public static void main(String[] args) {
		PizzaIngredientFactory  ingredientFactory=new NYPizzaIngredientFactory();
		Cheese[] cheese=ingredientFactory.createCheeses();
		Clams clam=	ingredientFactory.createClam();
		
	}

}
