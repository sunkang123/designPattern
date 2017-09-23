/**
 * 
 */
package com.sunkang.iterator;
/**
 *@author sunkang
 *@date 创建时间：2017年7月3日下午11:42:26
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Waitress {
	private DinerMenu dinerMenu;
	private PancakeHouseMenu houseMenu;
	public Waitress(DinerMenu dinerMenu, PancakeHouseMenu houseMenu) {
		this.dinerMenu = dinerMenu;
		this.houseMenu = houseMenu;
	}
	
	public void printMenu(){
		Iterator dinerMenuIterator=dinerMenu.createIterator();
		Iterator houseMenuIterator=houseMenu.createIterator();
		System.out.println("print DinerMenu");
		printMenu(dinerMenuIterator);
		System.out.println("print PancakehouseMenu");
		printMenu(houseMenuIterator);
	}
	
	public void printMenu(Iterator  iterator){
		while(iterator.hasNext()){
			MenuItem item=(MenuItem) iterator.next();
			System.out.println(item.getName()+":"+item.getDescription()+":"+item.getPrice());
		}
	}
	

}
