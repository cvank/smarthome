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

	
	public SingleConsumptionDevice(String deviceId, String deviceName) {
		setDeviceId(deviceId);
		setDeviceName(deviceName); 
	} 


	public Tuple<SustainableEnergy, List<EnergySource>> getDeviceEnergyData() {
		return deviceEnergyData;
	}


	/**
	 * Builds Single Consumption device.
	 * 
	 * @author chandrashekarv
	 *
	 */
	public static class SingleConsumptionDeviceBuilder extends SmartHomeDeviceBuilder {

		public SingleConsumptionDeviceBuilder() {
			super();
		}

		@Override
		public SmartHomeDevice build(Map<EnergyType, List<EnergySourceType>> deviceEnergyMap) {
			smartHomeDevice = new SingleConsumptionDevice(getDeviceId(), getDeviceName());
			// Set energy and respective energy sources.

			return smartHomeDevice;
		}

	}
}
