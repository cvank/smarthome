/**
 * 
 */
package com.turvo.assesment.data.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * SmartHome entity.
 * 
 * @author chandrashekarv
 *
 */
@Document(collection = "smarthome")
public class SmartHome {

	@Id
	private long homeId;

	private String homeName;

	private String type;

	private Date createdDate;

	private Date lastModiefiedDate;

	private List<Device> devices;

	private List<EnergySource> energySources;

	private List<Energy> energies;

	private AttributeData data;

	public AttributeData getData() {
		return data;
	}

	public void setData(AttributeData data) {
		this.data = data;
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

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	public long getHomeId() {
		return homeId;
	}

	public void setHomeId(long homeId) {
		this.homeId = homeId;
	}

	public String getHomeName() {
		return homeName;
	}

	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModiefiedDate() {
		return lastModiefiedDate;
	}

	public void setLastModiefiedDate(Date lastModiefiedDate) {
		this.lastModiefiedDate = lastModiefiedDate;
	}

}
