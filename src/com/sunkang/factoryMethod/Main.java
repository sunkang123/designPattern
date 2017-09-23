/**
 * 
 */
package com.sunkang.factoryMethod;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��25������11:27:54
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 
 * ԭ���汾��pizzastoreҪ�������еľ����������PizzaStore ---->NYstylecheesePizza ,NYstylevegiePizza
 * ���ù�������֮�󣬸߲������PizzaStore���͵Ͳ���������������������Pizza�����������ã�
 *   PizzaStore----->Pizza <----- NYstylecheesePizza ,NYstylevegiePizza
 * 
 * ���ԭ��
 * 1.Ҫ�������󣬲�Ҫ���������ࣨ�������ã�
 * 
 * ��������ģʽ������һ����������Ľӿڣ������������Ҫʵ�����������ĸ����������������ʵ�����Ƴٵ�����
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
