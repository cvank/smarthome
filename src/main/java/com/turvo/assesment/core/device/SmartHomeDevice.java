package com.turvo.assesment.core.device;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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

	private String homeId;

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getHomeId() {
		return homeId;
	}

	public void setHomeId(String homeId) {
		this.homeId = homeId;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	/*	*//**
			 * Consumption of the energy by the device.
			 *//*
				 * private Tuple3<SustainableEnergy, EnergySource, Consumption> consumption;
				 */

	public String getDeviceName() {
		return deviceName;
	}

	/*
	 * public Tuple3<SustainableEnergy, EnergySource, Consumption> getConsumption()
	 * { return consumption; }
	 */

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

		public String getDeviceName() {
			return deviceName;
		}

		public String getDeviceId() {
			return deviceId;
		}

		public SmartHomeDeviceBuilder() {
			super();
			this.deviceId = UUID.randomUUID().toString();
		}

		public SmartHomeDeviceBuilder deviceName(final String deviceName) {
			this.deviceName = deviceName;
			return this;
		}

		public abstract SmartHomeDevice build(Map<String, List<String>> deviceEnergyMap,
				Map<String, Object> additionalData);

	}
}
