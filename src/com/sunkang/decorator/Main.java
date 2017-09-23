/**
 * 
 */
package com.sunkang.decorator;
/**
 *@author sunkang
 *@date 创建时间：2017年6月25日下午9:44:32
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 利用继承设计子类的行为，是在编译时静态决定的，而且所有的子类都会继承相同的行为
 * 组合的做法扩展对象的行为，就可以在运行时动态地进行拓展。
 * 
 * 装饰者和被装饰者对象有相同的超 类型。
 * InputStream(抽象组件)--->FilterInputStream（抽象装饰者）----->{ 1.PushbackInputStream（装饰者）
 * 																2.BufferInputStream
 * 																3.DataInputStream
 * 																4.LineNumberInputStream 
 * 
 * 设计模式：
 * 1.类应该对拓展开放，对修改关闭。
 * 
 * 
 * 
 * 装饰者模式：动态地将责任附加到对象上，若要扩展功能，装饰者提供了比继承更加有弹性的替代方案
 */
public class Main {
	
	public static void main(String[] args) {
		Beverage beverage=new Expresso();
		System.out.println(beverage.getDescription()+":"+beverage.cost());
		
		beverage=new Mocha(beverage);
		beverage=new Wich(beverage);
		beverage=new Mocha(beverage);
		System.out.println(beverage.getDescription()+":"+beverage.cost());
		
		Beverage beverage1=new HouseBlend();
		System.out.println(beverage1.getDescription()+":"+beverage1.cost());
		beverage1=new Mocha(beverage1);
		beverage1=new Wich(beverage1);
		beverage1=new Wich(beverage1);
		System.out.println(beverage1.getDescription()+":"+beverage1.cost());
	}

	
	
}
