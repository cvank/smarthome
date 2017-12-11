/**
 * 
 */
package com.turvo.assesment.core.inbound;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.turvo.assesment.core.EnergyType;
import com.turvo.assesment.core.source.EnergySource;

/**
 * @author chandrashekarv
 *
 */
@Scope("request")
@Component
public class DeviceEnergyData implements Serializable {

	private static final long serialVersionUID = 8072060065941614498L;

	private EnergyType energyType;

	private List<? extends EnergySource> energySources;

	public EnergyType getEnergyType() {
		return energyType;
	}

	public void setEnergyType(EnergyType energyType) {
		this.energyType = energyType;
	}

	public List<? extends EnergySource> getEnergySources() {
		return energySources;
	}

	public void setEnergySources(List<? extends EnergySource> energySources) {
		this.energySources = energySources;
	}

}
