/**
 * 
 */
package com.turvo.assesment.core;

/**
 * ConsumptionUnit : SmartHome consumption unit of measurement.
 * 
 * @author chandrashekarv
 *
 */
public final class ConsumptionUnit {
	private double volume;
	private ConsumptionTypeUnit consumptionTypeUnit;
	private Duration consumptionTimeUnit;

	public ConsumptionUnit(double volume, ConsumptionTypeUnit consumptionTypeUnit,
			Duration consumptionTimeUnit) {
		super();
		this.volume = volume;
		this.consumptionTypeUnit = consumptionTypeUnit;
		this.consumptionTimeUnit = consumptionTimeUnit;
	}

	public double getVolume() {
		return volume;
	}

	public ConsumptionTypeUnit getConsumptionTypeUnit() {
		return consumptionTypeUnit;
	}

	public Duration getConsumptionTimeUnit() {
		return consumptionTimeUnit;
	}

	/**
	 * Consumption type.
	 * 
	 * @author chandrashekarv
	 *
	 */
	enum ConsumptionTypeUnit {

		KG, LITER, KW, M3;
	}

}
