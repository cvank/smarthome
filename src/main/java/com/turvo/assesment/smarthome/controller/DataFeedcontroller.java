/**
 * 
 */
package com.turvo.assesment.smarthome.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.turvo.assesment.smarthome.domain.DeviceFeedRequest;

/**
 * @author chandrashekarv
 *
 */
@RestController
@RequestMapping("/feed")
public class DataFeedcontroller {

	@PostMapping("/device")
	public @ResponseBody feed(@RequestBody DeviceFeedRequest feedRequest) {

	}

}
