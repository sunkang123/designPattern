/**
 * 
 */
package com.sunkang.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ݲ˵�
 *@author sunkang
 *@date ����ʱ�䣺2017��7��3������11:45:57
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class PancakeHouseMenu {
	List<MenuItem> menuItems;
	
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("regular pancake breakfast","pancakes with fied eggs",false,8.99);
		addItem("sk pancake breakfast","pancakes with fied eggs",false,8.99);
		addItem("sb pancake breakfast","pancakes with fied eggs",false,8.99);
	}


	public void addItem(String name,String description,boolean vegetarian,double price){
		MenuItem menuItem=new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public Iterator createIterator(){
		return new PancakeHouseIterator(menuItems);
	}
	
	
	
}
