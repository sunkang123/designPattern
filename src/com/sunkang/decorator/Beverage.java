/**
 * 
 */
package com.sunkang.decorator;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��25������9:31:51
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public abstract class Beverage {
	String description="unknow beverage";
	public String getDescription(){
		return  description;
	}
	public abstract double cost();

}
