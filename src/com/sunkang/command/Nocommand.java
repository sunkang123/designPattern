/**
 * 
 */
package com.sunkang.command;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������10:35:49
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public  class Nocommand implements Command {
	@Override
	public void excute() {
		System.out.println("ʲôҲ����");
	}

	@Override
	public void undo() {
		System.out.println("ʲôҲ������");
	}

}
