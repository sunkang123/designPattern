/**
 * 
 */
package com.sunkang.iterator;

import java.util.List;

/**
 *@author sunkang
 *@date 创建时间：2017年7月3日下午11:52:41
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
