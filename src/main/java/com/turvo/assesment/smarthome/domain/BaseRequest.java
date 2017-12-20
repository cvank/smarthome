/**
 * 
 */
package com.turvo.assesment.smarthome.domain;

import java.util.Map;

/**
 * @author chandrashekarv
 *
 */
public abstract class BaseRequest {

	/**
	 * Represent request
	 */
	private EntityType type;

	private Map<String, Object> additionalRequestData;

	public abstract RequestType requestType();

	public EntityType getType() {
		return type;
	}

	public void setType(EntityType type) {
		this.type = type;
	}

	public Map<String, Object> getAdditionalRequestData() {
		return additionalRequestData;
	}

	public void setAdditionalRequestData(Map<String, Object> additionalRequestData) {
		this.additionalRequestData = additionalRequestData;
	}

}
