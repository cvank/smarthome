/**
 * 
 */
package com.turvo.assesment.smarthome.domain;

import java.util.HashMap;
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
public class DeviceFeedRequest {

	private long deviceId;

	private List<DeviceRequestFeedData> deviceRequestFeedData;

	private Map<String, Object> additionalData = new HashMap<>();

	public Map<String, Object> getAdditionalData() {
		return additionalData;
	}

	public void setAdditionalData(Map<String, Object> additionalData) {
		this.additionalData = additionalData;
	}

	public long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}

	public List<DeviceRequestFeedData> getDeviceRequestFeedData() {
		return deviceRequestFeedData;
	}

	public void setDeviceRequestFeedData(List<DeviceRequestFeedData> deviceRequestFeedData) {
		this.deviceRequestFeedData = deviceRequestFeedData;
	}

	public static class DeviceRequestFeedData {
		private long energyId;

		private long energySourceId;

		public long getEnergyId() {
			return energyId;
		}

		public void setEnergyId(long energyId) {
			this.energyId = energyId;
		}

		public long getEnergySourceId() {
			return energySourceId;
		}

		public void setEnergySourceId(long energySourceId) {
			this.energySourceId = energySourceId;
		}

	}
}
