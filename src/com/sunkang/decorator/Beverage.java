/**
 * 
 */
package com.sunkang.decorator;
/**
 *@author sunkang
 *@date 创建时间：2017年6月25日下午9:31:51
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
