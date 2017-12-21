/**
 * 
 */
package com.turvo.assesment.smarthome.controller;

import org.springframework.web.bind.annotation.RequestBody;

import com.turvo.assesment.smarthome.domain.BaseRequest;
import com.turvo.assesment.smarthome.domain.response.Response;

/**
 * @author chandrashekarv
 *
 */
public interface GenericCRUDController {

	public <T extends BaseRequest> Response add(@RequestBody T baseRequest);

	public <T extends BaseRequest> Response remove(@RequestBody T baseRequest);

	public <T extends BaseRequest> Response update(@RequestBody T baseRequest);

}
