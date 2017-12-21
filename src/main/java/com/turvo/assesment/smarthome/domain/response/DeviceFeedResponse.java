/**
 * 
 */
package com.turvo.assesment.smarthome.domain.response;

/**
 * @author chandrashekarv
 *
 */
public class DeviceFeedResponse extends SmartHomeResponse {

	private long deviceId;

	public long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}

}
