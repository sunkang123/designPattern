/**
 * 
 */
package com.sunkang.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 实现了枚举接口转换为迭代器
 *@author sunkang
 *@date 创建时间：2017年6月28日上午12:03:35
 *@version 1.0
 * @param <E>
 *@parameter
 *@since
 *@return 
 */
public class EnumerationIterator<E> implements Iterator<E> {
	Enumeration<E> enumration;

	@Override
	public boolean hasNext() {
		return enumration.hasMoreElements();
	}

	@Override
	public E next() {
		return enumration.nextElement();
	}
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
