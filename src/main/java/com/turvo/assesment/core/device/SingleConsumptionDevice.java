/**
 * 
 */
package com.turvo.assesment.core.device;

import java.util.List;
import java.util.Map;

import com.turvo.assesment.core.EnergySourceType;
import com.turvo.assesment.core.EnergyType;
import com.turvo.assesment.core.Tuple;
import com.turvo.assesment.core.energy.SustainableEnergy;
import com.turvo.assesment.core.source.EnergySource;

/**
 * SingleConsumptionDevice : An installed device that consumes single
 * sustainable energy type.
 * 
 * @author chandrashekarv
 *
 */
public class SingleConsumptionDevice extends SmartHomeDevice {

	private static final long serialVersionUID = -1737460588851714322L;

	private Tuple<SustainableEnergy, List<EnergySource>> deviceEnergyData;

	private SingleConsumptionDevice() {
		super();
	}

	/**
	 * Builds Single Consumption device.
	 * 
	 * @author chandrashekarv
	 *
	 */
	public static class SingleConsumptionDeviceBuilder implements SmartHomeDeviceBuilder {

		@Override
		public SmartHomeDevice build(Map<EnergyType, List<EnergySourceType>> deviceEnergyMap) {
			return null;
		}

	}
}
