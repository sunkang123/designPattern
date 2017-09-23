/**
 * 
 */
package com.sunkang.command;


/**
 *@author sunkang
 *@date 创建时间：2017年6月26日下午10:20:57
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class CeilingFanHighCommand  implements Command{
	CellingFan cellingFan;
	int prespeed;

	public CeilingFanHighCommand(CellingFan cellingFan) {
		this.cellingFan = cellingFan;
	}
	
	@Override
	public void excute() {
		prespeed=cellingFan.getSpeed();
		cellingFan.high();
	}
	
	@Override
	public void undo() {
		if(prespeed==CellingFan.HIGH){
			cellingFan.high();
		}else if(prespeed==CellingFan.MEDIUM){
			cellingFan.medium();
		}else if(prespeed==CellingFan.LOW){
			cellingFan.low();
		}else if(prespeed==CellingFan.OFF){
			cellingFan.off();
		}
	}
	

}
