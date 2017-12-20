/**
 * 
 */
package com.turvo.assesment.smarthome.controller;

import org.springframework.web.bind.annotation.RequestBody;

import com.turvo.assesment.smarthome.domain.BaseRequest;

/**
 * @author chandrashekarv
 *
 */
public interface GenericCRUDController {

	public <T extends BaseRequest> void add(@RequestBody T baseRequest);

	public <T extends BaseRequest> void remove(@RequestBody T baseRequest);

	public <T extends BaseRequest> void update(@RequestBody T baseRequest);

}
