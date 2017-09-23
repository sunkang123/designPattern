/**
 * 
 */
package com.sunkang.strategy;
/**
 *@author sunkang
 *@date 创建时间：2017年6月13日上午10:26:36
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 设计原则：
 * 1.找出应用中可能需要变化之处，把他们独立出来，不要和那些不需要变化的代码混在一起
 * （封装变化）
 * 2.针对接口编程，而不是针对实现编程(关键在利用多态，针对超类型编程)
 * 3.多用组合，少用继承（建立系统有弹性 ，可以运行时动态改变行为）
 * 
 * 策略模式：定义了算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用
 * 算法的客户
 * 
 */
public class Main {
	public static void main(String[] args) {
		Duck modelduck=new ModelDuck();  //抽象父类Duck都是接口编程
		modelduck.dispaly();
		modelduck.perfromFly();
		modelduck.perfromQuack();
		//动态改变模型性飞的行为
		modelduck.setFlyBehavior(new FlyWithWings());
		modelduck.perfromFly();
		
		Duck redHeadDuck=new RedHeadDuck();
		redHeadDuck.dispaly();
		redHeadDuck.perfromFly();
		redHeadDuck.perfromQuack();
		
	}

}
