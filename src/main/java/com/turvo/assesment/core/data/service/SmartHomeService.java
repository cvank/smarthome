/**
 * 
 */
package com.turvo.assesment.core.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turvo.assesment.core.data.entity.SmartHome;
import com.turvo.assesment.core.data.repository.SmartHomeRepository;

/**
 * @author chandrashekarv
 *
 */
@Service
public class SmartHomeService {

	@Autowired
	SmartHomeRepository smartHomeRepository;

	public long addHome(SmartHome home) {
		return smartHomeRepository.save(home).getHomeId();

	}

	public boolean deleteHome(SmartHome home) {
		try {
			smartHomeRepository.delete(home.getHomeId());
		} catch (Exception e) {
			// log
		}
		return false;
	}
}
