package com.turvo.assesment.core.device;

import java.util.List;

import com.turvo.assesment.core.Consumption;
import com.turvo.assesment.core.energy.SustainableEnergy;

/**
 * SmartHomeDevice: Abstracts the device based on type of consumption.
 * 
 * @author chandrashekarv
 *
 */
public class SmartHomeDevice {

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
}
