package com.turvo.assesment.core;

import java.util.List;

import com.turvo.assesment.core.device.SmartHomeDevice;
import com.turvo.assesment.core.energy.SustainableEnergy;
import com.turvo.assesment.core.source.EnergySource;

/**
 * 
 * @author chandrashekarv
 *
 */
public class SmartHome {

	/**
	 * List of devices available in a home.
	 */
	private List<SmartHomeDevice> devices;

	/**
	 * List of energy sources providing various sustainable energies for a home.
	 */
	private List<EnergySource> energySources;

	/**
	 * List of sustainable energies running the devices available at home.
	 */
	private List<SustainableEnergy> sustainableEnergies;

	private SmartHome() {
		super();
	}

	public static class SmartHomeBuilder {

		public SmartHome build() {
			SmartHome home = new SmartHome();

			return home;
		}
	}

}
