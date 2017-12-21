/**
 * 
 */
package com.turvo.assesment.core.device;

import java.util.List;
import java.util.Map;

import com.turvo.assesment.core.EnergySourceType;
import com.turvo.assesment.core.EnergyType;
import com.turvo.assesment.core.Tuple;

/**
 * SingleConsumptionDevice : An installed device that consumes single
 * sustainable energy type.
 * 
 * @author chandrashekarv
 *
 */
public class SingleConsumptionDevice extends SmartHomeDevice {

	private static final long serialVersionUID = -1737460588851714322L;

	private Tuple<String, List<String>> deviceEnergyData;

	public SingleConsumptionDevice(String deviceId, String deviceName) {
		setDeviceId(deviceId);
		setDeviceName(deviceName);
	}

	public Tuple<String, List<String>> accessDeviceEnergyData() {
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
		public SmartHomeDevice build(Map<String, List<String>> deviceEnergyMap, Map<String, Object> additionalData) {
			smartHomeDevice = new SingleConsumptionDevice(getDeviceId(), getDeviceName());
			// Set energy and respective energy sources.

			return smartHomeDevice;
		}

		@Deprecated
		public SmartHomeDevice build1(Map<EnergyType, List<EnergySourceType>> deviceEnergyMap) {
			smartHomeDevice = new SingleConsumptionDevice(getDeviceId(), getDeviceName());
			// Set energy and respective energy sources.

			return smartHomeDevice;
		}

	}
}
