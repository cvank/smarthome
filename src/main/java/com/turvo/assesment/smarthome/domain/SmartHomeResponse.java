/**
 * 
 */
package com.turvo.assesment.smarthome.domain;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chandrashekarv
 *
 */
public class SmartHomeResponse {

	private String responseMessage;

	private String responseCode;

	private boolean isSuccess;

	private Map<String, Object> additionalResponseData;

	public Map<String, Object> getAdditionalResponseData() {
		return additionalResponseData;
	}

	public void setAdditionalResponseData(Map<String, Object> additionalResponseData) {
		this.additionalResponseData = additionalResponseData;
	}

	public void addAdditionalResponseData(Map<String, Object> additionalResponseData) {
		validate();
		this.additionalResponseData.putAll(additionalResponseData);
	}

	public void addAdditionalResponseData(final String key, final Object value) {
		validate();
		this.additionalResponseData.put(key, value);
	}

	private void validate() {
		if (Objects.isNull(additionalResponseData))
			additionalResponseData = new ConcurrentHashMap<>();

	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

}
