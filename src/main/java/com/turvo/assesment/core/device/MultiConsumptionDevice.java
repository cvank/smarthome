/**
 * 
 */
package com.turvo.assesment.core.device;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.turvo.assesment.core.EnergySourceType;
import com.turvo.assesment.core.EnergyType;
import com.turvo.assesment.core.Tuple;

/**
 * MultiConsumptionDevice : Device that utilizes multiple energies to run.
 * 
 * @author chandrashekarv
 *
 */
public class MultiConsumptionDevice extends SmartHomeDevice {

	private static final long serialVersionUID = -6725976529089029056L;

	private List<Tuple<String, List<String>>> deviceEnergyData;

	public MultiConsumptionDevice(String deviceId, String deviceName) {
		setDeviceId(deviceId);
		setDeviceName(deviceName);
	}

	public List<Tuple<String, List<String>>> accessDeviceEnergyData() {
		return Collections.unmodifiableList(deviceEnergyData);
	}

	/**
	 * Builds multi-Consumption device.
	 * 
	 * @author chandrashekarv
	 *
	 */
	public static class MultiConsumptionDeviceBuilder extends SmartHomeDeviceBuilder {

		public MultiConsumptionDeviceBuilder() {
			super();
		}

		@Override
		public SmartHomeDevice build(Map<Long, List<Long>> deviceEnergyMap, Map<String, Object> additionalData) {
			smartHomeDevice = new MultiConsumptionDevice(getDeviceId(), getDeviceName());

			return smartHomeDevice;
		}

		public SmartHomeDevice build1(Map<EnergyType, List<EnergySourceType>> deviceEnergyMap) {
			smartHomeDevice = new MultiConsumptionDevice(getDeviceId(), getDeviceName());

			return smartHomeDevice;
		}

	}

}
