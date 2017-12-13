/**
 * 
 */
package com.turvo.assesment.data.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Document that holds consumption data for a device.
 * 
 * @author chandrashekarv
 *
 */
@Document(collection = "deviceConsumption")
public class DeviceConsumption {

	@Id
	private long id;

	/**
	 * gets updpated every time consumption data is fed to the system.
	 */
	private List<ConsumptionData> consumptionData;

	/**
	 * Device document is mapped as a embedded document.
	 */
	private Device deviceId;

	public List<ConsumptionData> getConsumptionData() {
		return consumptionData;
	}

	public void setConsumptionData(List<ConsumptionData> consumptionData) {
		this.consumptionData = consumptionData;
	}

	public Device getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Device deviceId) {
		this.deviceId = deviceId;
	}

	public long getId() {
		return id;
	}

}
