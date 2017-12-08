/**
 * 
 */
package com.turvo.assesment.track;

import com.turvo.assesment.core.source.EnergySource;

/**
 * @author chandrashekarv
 *
 */
public enum EnergySourceConsumptionAnalyzer implements ConsumptionAnalyzer {

	INSTANCE;

	@Override
	public AnalysisData analyze(Object obj) {

		// Analyze consumption for the given energySource.
		EnergySource energySource = (EnergySource) obj;
		
		return null;
	}

}
