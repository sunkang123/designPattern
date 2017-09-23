/**
 * 
 */
package com.sunkang.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * ʵ����ö�ٽӿ�ת��Ϊ������
 *@author sunkang
 *@date ����ʱ�䣺2017��6��28������12:03:35
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
