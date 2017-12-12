/**
 * 
 */
package com.turvo.assesment.core.data.entity;

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

	private List<EnergySource> energySources;

	private List<Energy> energies;

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

	public List<EnergySource> getEnergySources() {
		return energySources;
	}

	public void setEnergySources(List<EnergySource> energySources) {
		this.energySources = energySources;
	}

	public List<Energy> getEnergies() {
		return energies;
	}

	public void setEnergies(List<Energy> energies) {
		this.energies = energies;
	}

	public List<DeviceEnergyData> getDeviceEnergyData() {
		return deviceEnergyData;
	}

	public void setDeviceEnergyData(List<DeviceEnergyData> deviceEnergyData) {
		this.deviceEnergyData = deviceEnergyData;
	}

}
