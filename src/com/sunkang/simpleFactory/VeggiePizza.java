/**
 * 
 */
package com.sunkang.simpleFactory;


/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��25������10:43:10
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class VeggiePizza extends Pizza {

	/* (non-Javadoc)
	 * @see com.sunkang.simpleFactory.Pizza#prepare()
	 */
	@Override
	void prepare() {
		System.out.println(" veggie pizza ��׼����");
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
