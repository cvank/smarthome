/**
 * 
 */
package com.turvo.assesment.data.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author chandrashekarv
 *
 */
@Document(collection = "device")
public class Device {

	@Id
	private long deviceId;

	private String deviceName;

	private List<DeviceEnergyData> deviceEnergyData;

	private AttributeData data;

	public AttributeData getData() {
		return data;
	}

	public void setData(AttributeData data) {
		this.data = data;
	}

	public long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public List<DeviceEnergyData> getDeviceEnergyData() {
		return deviceEnergyData;
	}

	public void setDeviceEnergyData(List<DeviceEnergyData> deviceEnergyData) {
		this.deviceEnergyData = deviceEnergyData;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (deviceId ^ (deviceId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (deviceId != other.deviceId)
			return false;
		return true;
	}

}
