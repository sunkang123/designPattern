/**
 * 
 */
package com.sunkang.template;
/**
 *@author sunkang
 *@date 创建时间：2017年6月28日下午8:39:15
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("过滤咖啡");
	}

	@Override
	void addCondiments() {
        System.out.println("加糖和牛奶");		
	}
	

	@Override
	boolean customerWantsCondiments() {
		boolean answer =getUserINput();
		if(answer){
			System.out.println("调用了钩子方法");
		}else{
			System.out.println("没有调用钩子方法");
		}
		return answer;
	}

	private boolean getUserINput(){
		return false;
	}
}
