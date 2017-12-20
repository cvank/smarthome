/**
 * 
 */
package com.turvo.assesment.smarthome.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author chandrashekarv
 *
 */
public enum RequestType {

	ADD("add"), REMOVE("remove"), UPDATE("update"), FEED("feed");
	
	private String type;

	private RequestType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@JsonCreator
	public static EntityType entityType(final String type) {
		for (EntityType entityType : EntityType.values())
			if (entityType.getType().equalsIgnoreCase(type))
				return entityType;

		return null;
	}

	@Override
	public String toString() {
		return this.getType();
	}

}
