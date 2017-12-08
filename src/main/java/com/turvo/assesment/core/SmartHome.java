package com.turvo.assesment.core;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import com.turvo.assesment.core.device.SmartHomeDevice;
import com.turvo.assesment.core.energy.SustainableEnergy;
import com.turvo.assesment.core.source.EnergySource;

/**
 * 
 * @author chandrashekarv
 *
 */
public class SmartHome implements Serializable {

	private static final long serialVersionUID = 1825879502069478903L;

	private HomeDetails homeDetails;

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

	public HomeDetails getHomeDetails() {
		return homeDetails;
	}

	public List<SmartHomeDevice> accessDevices() {
		return Collections.unmodifiableList(devices);
	}

	public List<EnergySource> accessEnergySources() {
		return Collections.unmodifiableList(energySources);
	}

	public List<SustainableEnergy> accessSustainableEnergies() {
		return Collections.unmodifiableList(sustainableEnergies);
	}

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
