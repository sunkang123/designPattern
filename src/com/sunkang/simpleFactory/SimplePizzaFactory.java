/**
 * 
 */
package com.sunkang.simpleFactory;


/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��25������10:38:44
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
