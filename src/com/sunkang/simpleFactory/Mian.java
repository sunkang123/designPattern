/**
 * 
 */
package com.sunkang.simpleFactory;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��25������10:51:00
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Mian {
	
	public static void main(String[] args) {
		SimplePizzaFactory factory=new SimplePizzaFactory();
		PizzStore store =new PizzStore(factory);
		store.orderPizza("cheese");
		store.orderPizza("veggie");
	}
}
