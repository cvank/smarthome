/**
 * 
 */
package com.turvo.assesment.core;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.turvo.assesment.core.device.SmartHomeDevice;
import com.turvo.assesment.core.device.SmartHomeDeviceFactory;
import com.turvo.assesment.core.event.publisher.SmartHomePublisher;
import com.turvo.assesment.data.service.SmartHomeService;
import com.turvo.assesment.smarthome.domain.DeviceFeedRequest;
import com.turvo.assesment.smarthome.domain.EntityType;

/**
 * @author chandrashekarv
 *
 */
@Component
public class SmartHomeEngine {

	@Autowired
	SmartHomeService smartHomeService;

	@Autowired
	PublisherFactory publisherFactory;

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
	public boolean addDevice(final long homeId, final String deviceName, final Map<Long, List<Long>> deviceData,
			final Map<String, Object> additionalRequestData) {

		// TODO: Check given energy and energy sources are already registered in the
		// system.
		// If not create the same.

		// Create device instance for the given details.
		SmartHomeDevice device = SmartHomeDeviceFactory.getInstance().create(deviceName, deviceData,
				additionalRequestData);

		// Invoke publisher for device registration
		Optional<SmartHomePublisher> homePublisherOp = publisherFactory.getPublisher(EventType.REGISTER,
				EntityType.DEVICE);

		if (homePublisherOp.isPresent()) {
			// Add device to home
			homePublisherOp.get().publish(device);
		}

		return true;

	}

	public long feed(DeviceFeedRequest feedRequest) {

		// Returns feed id, if feed is properly tracked.
		return 0;
	}
}
