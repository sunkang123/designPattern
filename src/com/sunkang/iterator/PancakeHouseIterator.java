/**
 * 
 */
package com.sunkang.iterator;

import java.util.List;

/**
 *@author sunkang
 *@date ����ʱ�䣺2017��7��3������11:52:41
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class PancakeHouseIterator implements Iterator{
	private List<MenuItem> menuItems;
	private java.util.Iterator<MenuItem> iterator;

	public PancakeHouseIterator(List<MenuItem> menuItemsf) {
		this.menuItems = menuItemsf;
		iterator= menuItems.iterator();
	}
	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}
	@Override
	public Object next() {
		return iterator.next();
	}

}
