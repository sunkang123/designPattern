/**
 * 
 */
package com.sunkang.simpleFactory;
/**
 *@author sunkang
 *@date 创建时间：2017年6月25日下午10:51:00
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
