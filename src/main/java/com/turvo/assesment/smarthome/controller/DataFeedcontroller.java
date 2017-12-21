/**
 * 
 */
package com.turvo.assesment.smarthome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.turvo.assesment.core.SmartHomeEngine;
import com.turvo.assesment.smarthome.domain.DeviceFeedRequest;
import com.turvo.assesment.smarthome.domain.response.SmartHomeResponse;

/**
 * Endpoint to simulate data feed for a device.
 * 
 * @author chandrashekarv
 *
 */
@RestController
@RequestMapping("/feed")
public class DataFeedcontroller {

	@Autowired
	SmartHomeEngine engine;

	@PostMapping("/device")
	public @ResponseBody SmartHomeResponse feed(@RequestBody DeviceFeedRequest feedRequest) {

		engine.feed(feedRequest);

		return null;
	}

}
