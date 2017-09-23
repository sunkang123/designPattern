/**
 * 
 */
package com.sunkang.simpleFactory;


/**
 *@author sunkang
 *@date 创建时间：2017年6月25日下午10:42:24
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class CheesePizza extends Pizza{

	/* (non-Javadoc)
	 * @see com.sunkang.simpleFactory.Pizza#prepare()
	 */
	@Override
	void prepare() {
			System.out.println("cheese pizza 在准备中");
	}

	/* (non-Javadoc)
	 * @see com.sunkang.simpleFactory.Pizza#bake()
	 */
	@Override
	void bake() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sunkang.simpleFactory.Pizza#cut()
	 */
	@Override
	void cut() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.sunkang.simpleFactory.Pizza#box()
	 */
	@Override
	void box() {
		// TODO Auto-generated method stub
		
	}

}
