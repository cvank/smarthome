/**
 * 
 */
package com.turvo.assesment.smarthome.domain;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author chandrashekarv
 *
 */
@Component
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class AddDeviceRequest extends AddRequest {

	private long homeId;

	/**
	 * Each map entry represents Energy Id as key and value energy sources as value.
	 */
	private Map<Long, List<Long>> deviceEnergyData;

	public long getHomeId() {
		return homeId;
	}

	public void setHomeId(long homeId) {
		this.homeId = homeId;
	}

	public Map<Long, List<Long>> getDeviceEnergyData() {
		return deviceEnergyData;
	}

	public void setDeviceEnergyData(Map<Long, List<Long>> deviceEnergyData) {
		this.deviceEnergyData = deviceEnergyData;
	}

}
