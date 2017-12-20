/**
 * 
 */
package com.turvo.assesment.smarthome.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author chandrashekarv
 *
 */
@Component
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class DeleteRequest extends BaseRequest {

	@Override
	public RequestType requestType() {
		return RequestType.REMOVE;
	}
	
	private long id;

}
