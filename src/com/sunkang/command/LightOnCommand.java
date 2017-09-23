/**
 * 
 */
package com.sunkang.command;
/**
 *@author sunkang
 *@date 创建时间：2017年6月26日下午10:11:14
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class LightOnCommand implements Command{
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void excute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
	

}
