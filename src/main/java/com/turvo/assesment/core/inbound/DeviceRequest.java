/**
 * 
 */
package com.turvo.assesment.core.inbound;

import java.io.Serializable;
import java.util.List;

/**
 * @author chandrashekarv
 *
 */
public class DeviceRequest implements Serializable {

	private static final long serialVersionUID = -3700216072323573818L;

	private String deviceName;

	private List<DeviceEnergyData> deviceEnergyDataList;

	private AttributeData attributeData;

	public AttributeData getAttributeData() {
		return attributeData;
	}

	public void setAttributeData(AttributeData attributeData) {
		this.attributeData = attributeData;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public List<DeviceEnergyData> getDeviceEnergyDataList() {
		return deviceEnergyDataList;
	}

	public void setDeviceEnergyDataList(List<DeviceEnergyData> deviceEnergyDataList) {
		this.deviceEnergyDataList = deviceEnergyDataList;
	}

}
