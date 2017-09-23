/**
 * 
 */
package com.sunkang.factory;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������12:14:00
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * ������������������Ҫ��չһ���࣬���������Ĺ����������õ��Ǽ̳�
 * 
 * ���󹤳� ��Ҫʵ�ֽӿڣ�����������Ʒ���壬ͨ���������ϡ�
 * 
 * ���󹤳�ģʽ���ṩһ���ӿڣ����ڴ�����ػ���������ļ��壬������Ҫ��ȷָ��������
 * PizzaIngredientFactory  �ӿڹ���
 * Cheese  �����Ʒʵ��
 */
public class Main {
	public static void main(String[] args) {
		PizzaIngredientFactory  ingredientFactory=new NYPizzaIngredientFactory();
		Cheese[] cheese=ingredientFactory.createCheeses();
		Clams clam=	ingredientFactory.createClam();
		
	}

}
