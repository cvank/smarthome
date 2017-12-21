/**
 * 
 */
package com.turvo.assesment.smarthome.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.turvo.assesment.core.SmartHomeEngine;
import com.turvo.assesment.smarthome.domain.AddDeviceRequest;
import com.turvo.assesment.smarthome.domain.BaseRequest;
import com.turvo.assesment.smarthome.domain.response.FailureResponse;
import com.turvo.assesment.smarthome.domain.response.Response;
import com.turvo.assesment.smarthome.domain.response.ResponseUtil;
import com.turvo.assesment.smarthome.domain.response.SmartHomeResponse;
import com.turvo.assesment.smarthome.domain.response.SuccessResponse;

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
	public Response remove(@RequestBody BaseRequest baseRequest) {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	@RequestMapping("update")
	public Response update(@RequestBody BaseRequest baseRequest) {

		return null;
	}

	@Override
	@RequestMapping("new-device")
	public @ResponseBody Response add(@RequestBody BaseRequest baseRequest) {
		AddDeviceRequest addDeviceRequest = (AddDeviceRequest) baseRequest;
		String deviceId = smartHomeEngine.addDevice(addDeviceRequest.getHomeId(), addDeviceRequest.getName(),
				addDeviceRequest.getDeviceEnergyData(), addDeviceRequest.getAdditionalRequestData());

		if (!Objects.isNull(deviceId)) {
			return constructAddSuccessResponse(deviceId, addDeviceRequest);
		}
		return constructFailureResponse(addDeviceRequest);
	}

	private Response constructAddSuccessResponse(String deviceId, AddDeviceRequest addDeviceRequest) {
		return new SuccessResponse(ResponseUtil.homeResponse(addDeviceRequest.getHomeId(), addDeviceRequest));

	}

	private Response constructFailureResponse(AddDeviceRequest addDeviceRequest) {
		return new FailureResponse(ResponseUtil.homeResponse(addDeviceRequest.getHomeId(), addDeviceRequest));

	}
}
