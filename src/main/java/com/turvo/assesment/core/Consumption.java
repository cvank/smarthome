/**
 * 
 */
package com.turvo.assesment.core;

/**
 * Captures Consumption based on consumption unit provided. And, defines various
 * operations on consumption unit.
 * 
 * Not allowed to be sub-classed.
 * 
 * @author chandrashekarv
 *
 */
public final class Consumption {

	/**
	 * Unit of consumption.
	 */
	private ConsumptionUnit consumptionUnit;

	public Consumption(ConsumptionUnit consumptionUnit) {
		super();
		this.consumptionUnit = consumptionUnit;
	}

	public ConsumptionUnit getConsumptionUnit() {
		return consumptionUnit;
	}

	public String getDisplayValue() {

		return null;
	}
}
