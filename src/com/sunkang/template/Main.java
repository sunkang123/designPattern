/**
 * 
 */
package com.sunkang.template;
/**
 *@author sunkang
 *@date 创建时间：2017年6月28日下午8:47:13
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 
 * 好莱坞原则：
 * 别调用（打电话给）我们，我们会调用（打电话给）你。
 * 
 * 好莱坞原则可以给我一种防止"依赖腐败"的方法，当高层组件依赖低层组件，而低层组件又依赖高层组件，而高层
 * 组件又依赖边侧组件，而边侧组件又依赖低层组件时，依赖腐败就发生了，没人知道系统是如何设计的
 * 
 * java的Arrays.sort（ducks）方法中duck需要实现了Comparable的方法才可以实现排序
 * （实现了对算法的封装，由类compateTo()方法的实现）
 * 
 * 模板方法模式：在一个方法定义了一个算法的骨架，而将一些步骤延迟到子类中，模板方法使得子类可以
 * 在不改变算法的结构的情况下，重新定义算法中的默写步骤
 */
public class Main {
	public static void main(String[] args) {
		Tea tea=new Tea();
		CoffeeWithHook coffee=new CoffeeWithHook();
		System.out.println("making a tea");
		tea.prepareRecipe();
		
		System.out.println("making a coffee");
		coffee.prepareRecipe();
		
	}
	

}
