/**
 * 
 */
package com.sunkang.facade;

import com.sunkang.adapter.Duck;
import com.sunkang.adapter.Turkey;
import com.sunkang.adapter.WildTurkey;
import com.sunkang.command.CellingFan;
import com.sunkang.command.Light;
import com.sunkang.factory.Cheese;

/**
 *@author sunkang
 *@date 创建时间：2017年6月28日上午12:23:29
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 
 * 设计原则：
 * 最少知识原则（）：只和你的密友谈话
 * 1.该对象本身
 * 2.被当做方法的参数而传递进来的对象
 * 3此方法所创建或实例化的任何对象
 * 4对象的任何组件（组合关系）
 * 
 * 
 * 外观模式：提供了一个统一的接口，用来访问子系统中的一群接口。外观模式定义了一个高层接口，让子系统更容易使用。
 */
public class Main {
	public static void main(String[] args) {
		//实例话组件
		Light light=null;
		CellingFan cellingFan=null;
		Cheese cheese=null;
		Turkey turkey=null;
		Duck duck=null;
		HomeTheaterFacade hoFacade=new HomeTheaterFacade(light, cellingFan, cheese, (WildTurkey) turkey, duck);
		hoFacade.watchMovie("sunkang coming");
		hoFacade.endMovie("sunkang go");
	}

}
