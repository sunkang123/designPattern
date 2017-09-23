package com.sunkang.simpleFactory;


/**
 *@author sunkang
 *@date 创建时间：2017年6月25日下午10:39:55
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public abstract class Pizza {
	abstract void prepare();
	abstract void bake();
	abstract void cut();
	abstract void box();
}
