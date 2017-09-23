/**
 * 
 */
package com.sunkang.adapter;
/**
 *@author sunkang
 *@date 创建时间：2017年6月27日下午11:41:35
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 这个模式可以通过创建适配器进行接口转换，让不兼容的接口变成兼容，这可以让客户从实现的接口解耦
 * 如果想改变接口，适配器可以将改变的部分封装起来
 * 
 * 实现了把客户与接口进行绑定起来，而不是和实现绑定起来
 * 
 * 类适配器使用多重继承，java不可以
 * 
 * 对象适配器使用组合的模式适配某个类
 * 
 * 适配器模式：将一个类的接口，转换成客户期望的另一个接口，
 * 适配器让原来的接口不兼容的类可以合作无间
 */
public class Main {
	public static void main(String[] args) {
		Duck duck=new MallardDuck();
		Turkey  turkey=new WildTurkey();
		System.out.println("the turkey say...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("the duck say.....");
		testDuck(duck);
		
		System.out.println(" the turkeyAdater say.....");
		Duck turkeyAdater=new TurkeyAdapter(turkey);//通过适配器把火鸡适配成鸭子
		testDuck(turkeyAdater);
		
	}
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
