/**
 * 
 */
package com.turvo.assesment.core.event.listener;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.turvo.assesment.core.Tuple;
import com.turvo.assesment.core.device.MultiConsumptionDevice;
import com.turvo.assesment.core.device.SingleConsumptionDevice;
import com.turvo.assesment.core.device.SmartHomeDevice;
import com.turvo.assesment.data.entity.AttributeData;
import com.turvo.assesment.data.entity.Device;
import com.turvo.assesment.data.service.SmartHomeService;

/**
 * @author chandrashekarv
 *
 */
@Component
public class DeviceListener implements EventListener {

	@Autowired
	SmartHomeService smartHomeService;

	@Override
	public boolean register(Object obj) {

		SmartHomeDevice device = (SmartHomeDevice) obj;
		smartHomeService.addDeviceToHome(device.getHomeId(), populateDeviceEntity(device));

		return true;

	}

	private Device populateDeviceEntity(SmartHomeDevice homeDevice) {
		Device device = new Device();
		device.setDeviceName(homeDevice.getDeviceName());
		device.setHomeId(homeDevice.getDeviceId());
		if (homeDevice instanceof SingleConsumptionDevice) {
			populateForSingleConsumptionDevice(device, homeDevice);
		} else if (homeDevice instanceof MultiConsumptionDevice) {
			populateForMultiConsumptionDevice(device, homeDevice);
		}
		return device;
	}

	private void populateForMultiConsumptionDevice(Device device, SmartHomeDevice homeDevice) {
		SingleConsumptionDevice singleConsumptionDevice = (SingleConsumptionDevice) homeDevice;
		device.setData(populateDeviceEnergyData(singleConsumptionDevice.accessDeviceEnergyData()));
	}

	private void populateForSingleConsumptionDevice(Device device, SmartHomeDevice homeDevice) {
		MultiConsumptionDevice multiConsumptionDevice = (MultiConsumptionDevice) homeDevice;
		device.setData(populateDeviceEnergyData(multiConsumptionDevice.accessDeviceEnergyData()));
	}

	private AttributeData populateDeviceEnergyData(Tuple<String, List<String>> accessDeviceEnergyData) {
		return null;
	}

	private AttributeData populateDeviceEnergyData(List<Tuple<String, List<String>>> accessDeviceEnergyData) {
		return null;
	}

	@Override
	public boolean deRegister(final long id) {

		return false;
	}

}
