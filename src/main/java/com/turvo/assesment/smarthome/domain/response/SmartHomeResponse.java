/**
 * 
 */
package com.turvo.assesment.smarthome.domain.response;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chandrashekarv
 *
 */
public class SmartHomeResponse {

	private String homeId;

	private String responseMessage;

	private String responseCode;

	private boolean isSuccess;

	private Map<String, Object> additionalResponseData;

	public SmartHomeResponse(String homeId, String responseMessage, String responseCode, boolean isSuccess,
			Map<String, Object> additionalResponseData) {
		super();
		this.homeId = homeId;
		this.responseMessage = responseMessage;
		this.responseCode = responseCode;
		this.isSuccess = isSuccess;
		this.additionalResponseData = additionalResponseData;
	}

	
	public SmartHomeResponse() {
		super();
	}


	public String getHomeId() {
		return homeId;
	}

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

	public String getResponseCode() {
		return responseCode;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public static class SmarthomeResponseBuilder {

		private String homeId;

		private String responseMessage;

		private String responseCode;

		private boolean isSuccess;

		private Map<String, Object> additionalResponseData;

		public SmarthomeResponseBuilder(String homeId) {
			super();
			this.homeId = homeId;
		}

		public SmarthomeResponseBuilder() {
			super();
		}

		public SmarthomeResponseBuilder withHomeId(String homeId) {
			this.homeId = homeId;
			return this;
		}

		public SmarthomeResponseBuilder withResponseMessage(String responseMessage) {
			this.responseMessage = responseMessage;
			return this;
		}

		public SmarthomeResponseBuilder withResponseCode(String responseCode) {
			this.responseCode = responseCode;
			return this;
		}

		public SmarthomeResponseBuilder withSuccess(boolean isSuccess) {
			this.isSuccess = isSuccess;
			return this;
		}

		public SmarthomeResponseBuilder withAdditionalData(Map<String, Object> additionalResponseData) {
			getAdditionalResponseData().putAll(additionalResponseData);
			return this;
		}

		private Map<String, Object> getAdditionalResponseData() {

			if (Objects.isNull(additionalResponseData))
				additionalResponseData = new ConcurrentHashMap<>();

			return additionalResponseData;
		}

		public SmarthomeResponseBuilder withAdditionalData(String key, Object val) {
			getAdditionalResponseData().put(key, val);
			return this;
		}

		public SmartHomeResponse build() {
			return new SmartHomeResponse(homeId, responseMessage, responseCode, isSuccess, additionalResponseData);

		}
	}

}
