/**
 * 
 */
package com.sunkang.factoryMethod;
/**
 *@author sunkang
 *@date 创建时间：2017年6月25日下午11:27:54
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 
 * 原来版本的pizzastore要依赖所有的具体比萨对象。PizzaStore ---->NYstylecheesePizza ,NYstylevegiePizza
 * 运用工厂方法之后，高层组件（PizzaStore）和低层组件（具体比萨）都依赖Pizza抽象（依赖倒置）
 *   PizzaStore----->Pizza <----- NYstylecheesePizza ,NYstylevegiePizza
 * 
 * 设计原则：
 * 1.要依赖抽象，不要依赖具体类（依赖倒置）
 * 
 * 工厂方法模式：定义一个创建对象的接口，但由子类决定要实例化的类是哪个，工厂方法让类把实例化推迟到子类
 * 
 */
public class Main {
	public static void main(String[] args) {
		PizzaStore nystore=new NYpizzaStore();
		PizzaStore chicagostore=new ChicagopizzaStore();
		Pizza pizza=nystore.orderPizza("cheese");
		System.out.println("sunkang order a "+pizza.getName());
		
		pizza=chicagostore.orderPizza("cheese");
		System.out.println("yuzhong order a "+pizza.getName());
		
	}

}
