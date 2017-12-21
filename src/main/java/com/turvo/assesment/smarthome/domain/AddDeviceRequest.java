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

	private String homeId;

	/**
	 * Each map entry represents Energy Id as key and value energy sources as value.
	 */
	private Map<String, List<String>> deviceEnergyData;

	public String getHomeId() {
		return homeId;
	}

	public void setHomeId(String homeId) {
		this.homeId = homeId;
	}

	public Map<String, List<String>> getDeviceEnergyData() {
		return deviceEnergyData;
	}

	public void setDeviceEnergyData(Map<String, List<String>> deviceEnergyData) {
		this.deviceEnergyData = deviceEnergyData;
	}

}
