/**
 * 
 */
package com.turvo.assesment.core;

import java.util.Calendar;

/**
 * ConsumptionUnit : SmartHome consumption unit of measurement.
 * 
 * @author chandrashekarv
 *
 */
public final class ConsumptionUnit {
	private double volume;
	private ConsumptionTypeUnit consumptionTypeUnit;
	private ConsumptionTimeUnit consumptionTimeUnit;

	public ConsumptionUnit(double volume, ConsumptionTypeUnit consumptionTypeUnit,
			ConsumptionTimeUnit consumptionTimeUnit) {
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

	public ConsumptionTimeUnit getConsumptionTimeUnit() {
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

	/**
	 * Consumption duration.
	 * 
	 * @author chandrashekarv
	 *
	 */
	enum ConsumptionTimeUnit {

		DAY(java.util.Calendar.DAY_OF_YEAR), HOUR(Calendar.HOUR), MINUTE(Calendar.MINUTE), MONTH(
				Calendar.MONTH), SECOND(Calendar.SECOND), WEEK(Calendar.WEEK_OF_YEAR), YEAR(Calendar.YEAR);
		private final int timeVariant;

		private ConsumptionTimeUnit(int timeVariant) {
			this.timeVariant = timeVariant;
		}

		public int getTimeVariant() {
			return timeVariant;
		}

	}

}
