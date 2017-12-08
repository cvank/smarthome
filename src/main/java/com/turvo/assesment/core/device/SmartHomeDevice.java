package com.turvo.assesment.core.device;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.turvo.assesment.core.Consumption;
import com.turvo.assesment.core.EnergySourceType;
import com.turvo.assesment.core.EnergyType;
import com.turvo.assesment.core.energy.SustainableEnergy;

/**
 * SmartHomeDevice: Abstracts the device based on type of consumption.
 * 
 * @author chandrashekarv
 *
 */
public class SmartHomeDevice implements Serializable {

	private static final long serialVersionUID = -135024356194999530L;

	/**
	 * Energies needed to run the device such as power, water etc.
	 */
	private List<SustainableEnergy> deviceEnergy;

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
	private Consumption consumption;

	/**
	 * Enable to build smart home device for the given details.
	 * 
	 * @author chandrashekarv
	 *
	 */
	public static interface SmartHomeDeviceBuilder {

		public SmartHomeDevice build(Map<EnergyType, List<EnergySourceType>> deviceEnergyMap);
	}
}
