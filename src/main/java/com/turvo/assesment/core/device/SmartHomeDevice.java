package com.turvo.assesment.core.device;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.turvo.assesment.core.Consumption;
import com.turvo.assesment.core.EnergySourceType;
import com.turvo.assesment.core.EnergyType;
import com.turvo.assesment.core.Tuple3;
import com.turvo.assesment.core.energy.SustainableEnergy;
import com.turvo.assesment.core.source.EnergySource;

/**
 * SmartHomeDevice: Abstracts the device based on type of consumption.
 * 
 * @author chandrashekarv
 *
 */
public class SmartHomeDevice implements Serializable {

	private static final long serialVersionUID = -135024356194999530L;

	/**
	 * Name of the device.
	 */
	private String deviceName;

	/**
	 * Unique identifier.
	 */
	private String deviceId;

	/**
	 * Consumption of the energy by the device.
	 */
	private Tuple3<SustainableEnergy, EnergySource, Consumption> consumption;

	/**
	 * Enable to build smart home device for the given details.
	 * 
	 * @author chandrashekarv
	 *
	 */
	public static abstract class SmartHomeDeviceBuilder {

		protected SmartHomeDevice smartHomeDevice;

		/**
		 * Name of the device.
		 */
		private String deviceName;

		/**
		 * Unique identifier.
		 */
		private String deviceId;

		public SmartHomeDeviceBuilder() {
			super();
			this.deviceId = UUID.randomUUID().toString();
		}

		public SmartHomeDeviceBuilder deviceName(final String deviceName) {
			this.deviceName = deviceName;
			return this;
		}

		public abstract SmartHomeDevice build(Map<EnergyType, List<EnergySourceType>> deviceEnergyMap);

	}
}
