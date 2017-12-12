/**
 * 
 */
package com.turvo.assesment.data.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.turvo.assesment.data.entity.Device;
import com.turvo.assesment.data.entity.SmartHome;
import com.turvo.assesment.data.service.DeviceService;
import com.turvo.assesment.data.service.SmartHomeService;

/**
 * @author chandrashekarv
 *
 */
@Component
public class SmartHomeFacade {

	@Autowired
	SmartHomeService smartHomeService;

	@Autowired
	DeviceService deviceService;

	public void addDeviceToHome(SmartHome home, Device device) {
		
		
	}
}
