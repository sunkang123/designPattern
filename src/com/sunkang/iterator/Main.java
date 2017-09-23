/**
 * 
 */
package com.sunkang.iterator;
/**
 *@author sunkang
 *@date 创建时间：2017年7月4日上午12:11:09
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 迭代器模式把在元素之间的游走的责任交个了迭代器，而不是聚合对象。让聚合的对象和实现变得更加简洁
 * 
 * 迭代器模式：提供一种方法顺序访问一个聚合对象的各个元素，而不暴露其内部的表示。
*
*
 */
public class Main {
	public static void main(String[] args) {
		PancakeHouseMenu houseMenu=new PancakeHouseMenu(); 
		DinerMenu dinerMenu=new DinerMenu();
		Waitress waitress=new Waitress(dinerMenu, houseMenu);
		waitress.printMenu();
	}
	

}
