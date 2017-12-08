/**
 * 
 */
package com.turvo.assesment.track;

import com.turvo.assesment.core.Consumption;

/**
 * Post analyzing the consumption per device, per energy source, per energy this
 * POJO gets filled and will be sent as response.
 * 
 * @author chandrashekarv
 *
 */
public class AnalysisData {

	private Consumption consumption;

	private String type;

	public String getType() {
		return type;
	}

	/**
	 * Holds child data.
	 */
	private Object data;

	public AnalysisData(Consumption consumption, final String type) {
		super();
		this.consumption = consumption;
		this.type = type;
	}

	public void setConsumption(Consumption consumption) {
		this.consumption = consumption;
	}

	public Consumption getConsumption() {
		return consumption;
	}

}
