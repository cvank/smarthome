/**
 * 
 */
package com.turvo.assesment.track;

import com.turvo.assesment.core.EnergySourceType;
import com.turvo.assesment.core.EnergyType;
import com.turvo.assesment.core.SmartHome;
import com.turvo.assesment.core.device.SmartHomeDevice;

/**
 * @author chandrashekarv
 *
 */
public class ConsumptionAnalyzerEngine {

	/**
	 * Provide consumption analysis for all the devices of the given home.
	 * 
	 * @param smartHome
	 * @return
	 */
	public AnalysisData analyze(final SmartHome smartHome) {

		return null;
	}

	/**
	 * Provide consumption analysis for the given device.
	 * 
	 * @param homeDevice
	 * @return
	 */
	public AnalysisData analyze(final SmartHomeDevice homeDevice) {

		return null;
	}

	/**
	 * Provide consumption analysis of the given energy type such as Water, for the
	 * given house.
	 * 
	 * @param home
	 * @param energyType
	 * @return
	 */
	public AnalysisData analyze(final SmartHome home, final EnergyType energyType) {

		return null;
	}

	/**
	 * Consumption analysis for the given energy source type.
	 * 
	 * @param home
	 * @param energySourceType
	 * @return
	 */
	public AnalysisData analyze(final SmartHome home, final EnergySourceType energySourceType) {

		return null;
	}
}
