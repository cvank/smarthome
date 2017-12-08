/**
 * 
 */
package com.turvo.assesment.core.source;

/**
 * @author chandrashekarv
 *
 */
public class WindEnergySource extends EnergySource {

	@Override
	public long register() {

		return 1;
	}

	@Override
	public boolean deRegister() {

		return false;
	}

}
