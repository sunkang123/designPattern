/**
 * 
 */
package com.sunkang.simpleFactory;


/**
 *@author sunkang
 *@date 创建时间：2017年6月25日下午10:38:44
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class SimplePizzaFactory {
	public Pizza createPizza(String type){
		Pizza  pizza=null;
		if(type.equals("cheese")){
			pizza=new CheesePizza();
		}else if(type.equals("veggie")){
			pizza= new VeggiePizza();
		}else if(type.equals("clam")){
			pizza=new ClamPizza();
		}
		return pizza;
	}

}
