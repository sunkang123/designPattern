/**
 * 
 */
package com.sunkang.template;
/**
 *@author sunkang
 *@date 创建时间：2017年6月28日下午8:31:16
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public  abstract class CaffeineBeverageWithHook {
	
	void prepareRecipe(){
		boilWater(); //倒水
		brew();  //浸泡
		pourInCup();//倒入杯中
		if(customerWantsCondiments()){
			addCondiments();  //最后加入调料
		}
	}	
	abstract void brew();
	
	abstract void addCondiments();
	
	 boolean customerWantsCondiments() {
		return true;
	}

	
	 void pourInCup() {
		System.out.println("倒入杯中");
	}
	 void boilWater() {
		System.out.println("倒水");
	}

}
