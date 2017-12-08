/**
 * 
 */
package com.turvo.assesment.core.source;

/**
 * EnergySource : All Energy sources implementations are type of EnergySource interface.
 * 
 * @author chandrashekarv
 *
 */
public abstract class EnergySource {
	
	public abstract long register();
	
	public abstract boolean deRegister();

}
