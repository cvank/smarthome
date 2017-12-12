/**
 * 
 */
package com.turvo.assesment.data.entity;

import java.util.List;

/**
 * @author chandrashekarv
 *
 */
public class DeviceEnergyData {

	private Energy energy;

	private List<EnergySource> energySources;

	public Energy getEnergy() {
		return energy;
	}

	public void setEnergy(Energy energy) {
		this.energy = energy;
	}

	public List<EnergySource> getEnergySources() {
		return energySources;
	}

	public void setEnergySources(List<EnergySource> energySources) {
		this.energySources = energySources;
	}

}
