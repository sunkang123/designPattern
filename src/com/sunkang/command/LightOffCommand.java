/**
 * 
 */
package com.sunkang.command;
/**
 *@author sunkang
 *@date 创建时间：2017年6月26日下午10:14:17
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class LightOffCommand implements Command{
	Light light;

	public LightOffCommand(Light light) {
		this.light=light;
	}
	@Override
	public void excute() {
		light.off();
	}
	@Override
	public void undo() {
		light.on();
	}
}
