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

	private String energyId;

	private List<String> energySourceIds;

	public String getEnergyId() {
		return energyId;
	}

	public void setEnergyId(String energyId) {
		this.energyId = energyId;
	}

	public List<String> getEnergySourceIds() {
		return energySourceIds;
	}

	public void setEnergySourceIds(List<String> energySourceIds) {
		this.energySourceIds = energySourceIds;
	}

}
