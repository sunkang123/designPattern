/**
 * 
 */
package com.sunkang.iterator;



/**
 *@author sunkang
 *@date 创建时间：2017年7月3日下午11:27:34
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class DinerMenu {
	private static int max_items=6;
	private int numberOfItems=0;
	private MenuItem[] menuItems;
	public DinerMenu() {
		menuItems=new MenuItem[max_items];
		addItem("Hotdog","a hot dog,with saurkaut",false,3.05);
		addItem("sk","a hot dog,with saurkaut",false,3.05);
		addItem("soup","a hot dog,with saurkaut",false,3.05);
		addItem("blt","a hot dog,with saurkaut",false,3.05);
		addItem("moddle","a hot dog,with saurkaut",false,3.05);
	}
	public void addItem(String name,String description,boolean vegetarian,double price){
		MenuItem menuItem =new MenuItem(name, description, vegetarian, price);
		if(numberOfItems>=max_items){
			System.out.println("sorry,menu is full! cant add item to menu");
		}else{
			menuItems[numberOfItems]=menuItem;
			numberOfItems++;
		}
	}
	
	public Iterator createIterator(){
		return new DinerMenuIterator(menuItems);
	}
	
}
