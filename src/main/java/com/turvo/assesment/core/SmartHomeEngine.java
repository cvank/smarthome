/**
 * 
 */
package com.turvo.assesment.core;

import java.util.List;
import java.util.Map;

import com.turvo.assesment.core.device.SmartHomeDevice;
import com.turvo.assesment.core.device.SmartHomeDeviceFactory;

/**
 * @author chandrashekarv
 *
 */
public class SmartHomeEngine {

	/**
	 * Adds home to the system.
	 * 
	 * @param name
	 * @param address
	 * @return
	 */
	public boolean addHome(final String name, final String address,
			final Map<EnergyType, List<EnergySourceType>> deviceData) {

		// Create a home.
		SmartHome home = null; // SmartHomeFactory.getInstance().create(name, address, deviceData);

		
		// TODO: Invoke publisher for Home registration
		
		return true;

	}
	
	/**
	 * Adds home to the system.
	 * 
	 * @param name
	 * @param address
	 * @return
	 */
	public boolean addHomeWithDevices(final String name, final String address,
			final Map<EnergyType, List<EnergySourceType>> deviceData) {

		// Create a home.
		SmartHome home = null; // SmartHomeFactory.getInstance().create(name, address, deviceData);

		
		// TODO: Invoke publisher for Home registration
		
		return true;

	}

	/**
	 * Creates a device and adds it to smarthome.
	 * 
	 * @param homeId
	 * @param deviceName
	 * @param deviceData
	 * @return
	 */
	public boolean addDevice(final long homeId, final String deviceName,
			final Map<EnergyType, List<EnergySourceType>> deviceData) {

		// TODO: Check given energy and energy sources are already registered in the
		// system.
		// If not create the same.

		// Create device instance for the given details.
		SmartHomeDevice device = SmartHomeDeviceFactory.getInstance().create(deviceName, deviceData);

		// Invoke publisher for device registration

		// Add device to home

		return true;

	}
}
