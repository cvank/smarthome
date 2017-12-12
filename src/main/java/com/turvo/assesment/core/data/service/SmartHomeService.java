/**
 * 
 */
package com.turvo.assesment.core.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turvo.assesment.core.data.entity.Device;
import com.turvo.assesment.core.data.entity.Energy;
import com.turvo.assesment.core.data.entity.SmartHome;
import com.turvo.assesment.core.data.repository.BaseRepository;
import com.turvo.assesment.core.data.repository.SmartHomeRepository;

/**
 * @author chandrashekarv
 *
 */
@Service
public class SmartHomeService extends BaseService {

	@Autowired
	SmartHomeRepository smartHomeRepository;

	public List<SmartHome> fetchAll() {
		return super.fetchAll(SmartHome.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends BaseRepository> T repository() {
		return (T) smartHomeRepository;
	}

	public long addHome(SmartHome home) {
		return super.add(home).getHomeId();

	}

	public boolean deleteHome(SmartHome home) {
		try {
			super.delete(home);
		} catch (Exception e) {
			// log
		}
		return false;
	}

	public void addDeviceToHome(SmartHome home, Device device) {
		home.getDevices().add(device);
		saveOrUpdate(home);
	}

	public void addDevicesToHome(SmartHome home, List<Device> devices) {
		home.getDevices().addAll(devices);
		saveOrUpdate(home);
	}

	public void removeDeviceFromHome(SmartHome home, Device device) {
		home.getDevices().remove(device);
		saveOrUpdate(home);
	}

	public void removeDevicesFromHome(SmartHome home, List<Device> devices) {
		home.getDevices().removeAll(devices);
		saveOrUpdate(home);
	}

	public void addEnergyToHome(SmartHome home, Energy energy) {
		home.getEnergies().add(energy);
		saveOrUpdate(home);
	}

	private void saveOrUpdate(SmartHome home) {
		super.saveOrUpdate(home);
	}

	public void addEnergiesToHome(SmartHome home, List<Energy> energies) {
		home.getEnergies().addAll(energies);
		saveOrUpdate(home);
	}

	public void removeEnergyFromHome(SmartHome home, Energy energy) {
		home.getEnergies().remove(energy);
		saveOrUpdate(home);
	}

	public void removeEnergiesFromHome(SmartHome home, List<Energy> energies) {
		home.getEnergies().removeAll(energies);
		saveOrUpdate(home);
	}
}
