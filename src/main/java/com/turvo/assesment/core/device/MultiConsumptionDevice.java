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
 * MultiConsumptionDevice : Device that utilizes multiple energies to run.
 * 
 * @author chandrashekarv
 *
 */
public class MultiConsumptionDevice extends SmartHomeDevice {

	private static final long serialVersionUID = -6725976529089029056L;

	private List<Tuple<SustainableEnergy, List<EnergySource>>> deviceEnergyData;

	/**
	 * Builds multi Consumption device.
	 * 
	 * @author chandrashekarv
	 *
	 */
	public static class MultiConsumptionDeviceBuilder extends SmartHomeDeviceBuilder {
		
		public MultiConsumptionDeviceBuilder() {
			super();
		}

		@Override
		public SmartHomeDevice build(Map<EnergyType, List<EnergySourceType>> deviceEnergyMap) {
			smartHomeDevice = new MultiConsumptionDevice();
			
			return smartHomeDevice;
		}

	}

}
