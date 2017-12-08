/**
 * 
 */
package com.turvo.assesment.core.device;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.turvo.assesment.core.EnergySourceType;
import com.turvo.assesment.core.EnergyType;
import com.turvo.assesment.core.device.MultiConsumptionDevice.MultiConsumptionDeviceBuilder;
import com.turvo.assesment.core.device.SingleConsumptionDevice.SingleConsumptionDeviceBuilder;
import com.turvo.assesment.core.device.SmartHomeDevice.SmartHomeDeviceBuilder;

/**
 * SmartHomeDeviceFactory : Creates device instance based on the incoming
 * details.
 * 
 * @author chandrashekarv
 *
 */
public class SmartHomeDeviceFactory {

	public SmartHomeDevice create(final String deviceName, final Map<EnergyType, List<EnergySourceType>> deviceData) {

		int noOfEnergyTypes = Objects.isNull(deviceData) ? 0 : deviceData.size();
		SmartHomeDeviceBuilder builder = null;
		
		/**
		 * If only one energy type is being used by a device then it is considered as
		 * single consumption device.
		 */
		switch (noOfEnergyTypes) {
		case 1:
		case 0:

			builder = new SingleConsumptionDeviceBuilder();
			break;

		default:
			builder = new MultiConsumptionDeviceBuilder();
		}

		return builder.deviceName(deviceName).build(deviceData);

	}
}
