/**
 * 
 */
package com.turvo.assesment.track;

import com.turvo.assesment.core.energy.SustainableEnergy;

/**
 * @author chandrashekarv
 *
 */
public enum EnergyConsumptionAnalyzer implements ConsumptionAnalyzer {

	INSTANCE;
	@Override
	public AnalysisData analyze(Object obj) {

		SustainableEnergy energy = (SustainableEnergy) obj;
		
		// Analyze total utilization of the given energy.
		
		return null;
	}

}
