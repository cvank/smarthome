/**
 * 
 */
package com.turvo.assesment.smarthome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turvo.assesment.core.SmartHomeEngine;
import com.turvo.assesment.smarthome.domain.AddDeviceRequest;
import com.turvo.assesment.smarthome.domain.BaseRequest;

/**
 * @author chandrashekarv
 *
 */
@RestController
@RequestMapping("/smarthome/device/")
public class DeviceController implements GenericCRUDController {

	@Autowired
	SmartHomeEngine smartHomeEngine;

	@Override
	@RequestMapping("remove")
	public void remove(@RequestBody BaseRequest baseRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	@RequestMapping("update")
	public void update(@RequestBody BaseRequest baseRequest) {

	}

	@Override
	@RequestMapping("new-device")
	public void add(@RequestBody BaseRequest baseRequest) {
		AddDeviceRequest addDeviceRequest = (AddDeviceRequest) baseRequest;
		smartHomeEngine.addDevice(addDeviceRequest.getHomeId(), addDeviceRequest.getName(),
				addDeviceRequest.getDeviceEnergyData(), addDeviceRequest.getAdditionalRequestData());

	}

}
