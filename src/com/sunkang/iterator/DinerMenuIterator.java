/**
 * 
 */
package com.sunkang.iterator;
/**
 * 迭代器类
 *@author sunkang
 *@date 创建时间：2017年7月3日下午11:18:40
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class DinerMenuIterator implements Iterator{
	MenuItem[]  menuItems;
	private int position=0;
	
	
	public DinerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}
	@Override
	public boolean hasNext() {
		if(position>=menuItems.length||menuItems[position]==null){
			return false;
		}else {
			return true;
		}
	}
	@Override
	public Object next() {
		MenuItem	menuItem=menuItems[position];
		position++;
		return menuItem;
	}

}
