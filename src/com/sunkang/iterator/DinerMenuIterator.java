/**
 * 
 */
package com.sunkang.iterator;
/**
 * ��������
 *@author sunkang
 *@date ����ʱ�䣺2017��7��3������11:18:40
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
