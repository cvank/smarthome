/**
 * 
 */
package com.turvo.assesment.data.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author chandrashekarv
 *
 */
@Document(collection = "consumptiondata")
public class ConsumptionData {

	@Id
	private long id;

	// Time of entry.
	private Date entryTime;

	// Total units consumed
	private double unitsConsumed;

	// Time taken to consume total units
	private double timeTaken;

	// Unit of consumption.
	private String consumptionUnit;

	// Referenced with energy id. The energy that is consumed by the device.
	private long energyId;

	// Referenced with energy source. The energy source that is utilized to generate
	// the energy used by by the device.
	private long energySource;

	
	public long getId() {
		return id;
	}

	public long getEnergyId() {
		return energyId;
	}

	public void setEnergyId(long energyId) {
		this.energyId = energyId;
	}

	public long getEnergySource() {
		return energySource;
	}

	public void setEnergySource(long energySource) {
		this.energySource = energySource;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public double getUnitsConsumed() {
		return unitsConsumed;
	}

	public void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	public double getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(double timeTaken) {
		this.timeTaken = timeTaken;
	}

	public String getConsumptionUnit() {
		return consumptionUnit;
	}

	public void setConsumptionUnit(String consumptionUnit) {
		this.consumptionUnit = consumptionUnit;
	}

}
