/**
 * 
 */
package com.turvo.assesment.track;

import com.turvo.assesment.core.device.SmartHomeDevice;

/**
 * @author chandrashekarv
 *
 */
public class DeviceConsumptionAnalyzer implements ConsumptionAnalyzer {

	private SmartHomeDevice device;

	private DeviceConsumptionAnalyzer(SmartHomeDevice device) {
		super();
		this.device = device;
	}

	@Override
	public AnalysisData analyze() {
		
		// analyze device consumption.
		
		return null;
	}

}
