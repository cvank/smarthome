/**
 * 
 */
package com.turvo.assesment.smarthome.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author chandrashekarv
 *
 */
public enum EntityType {

	HOME("home"), ENERGY("energy"), DEVICE("device"), ENERGY_SOURCE("energysource");

	private String type;

	private EntityType(String type) {
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

	public static void main(String[] args) {
		System.out.println(EntityType.entityType("home"));
	}
}
