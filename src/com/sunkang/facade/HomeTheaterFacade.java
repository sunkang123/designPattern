/**
 * 
 */
package com.sunkang.facade;

import com.sunkang.adapter.Duck;
import com.sunkang.adapter.WildTurkey;
import com.sunkang.command.CellingFan;
import com.sunkang.command.Light;
import com.sunkang.factory.Cheese;

/**
 *@author sunkang
 *@date 创建时间：2017年6月28日上午12:15:28
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class HomeTheaterFacade {
	Light light;
	CellingFan cellingFan;
	Cheese cheese;
	WildTurkey turkey;
	Duck duck;
	public HomeTheaterFacade(Light light, CellingFan cellingFan, Cheese cheese,
			WildTurkey turkey, Duck duck) {
		super();
		this.light = light;
		this.cellingFan = cellingFan;
		this.cheese = cheese;
		this.turkey = turkey;
		this.duck = duck;
	}
	
	public void watchMovie(String movie){
		System.out.println("get ready to watch a movie:"+movie);
		light.on();
		cellingFan.high();
		cheese.toString();
		turkey.gobble();
		duck.fly();
		System.out.println(" i am watch movie");
	}
	
	public void endMovie(String movie){
		light.off();
		cellingFan.off();
		cheese.toString();
		turkey.gobble();
		duck.fly();
		System.out.println("shutting down movice:"+movie);
	}
}
