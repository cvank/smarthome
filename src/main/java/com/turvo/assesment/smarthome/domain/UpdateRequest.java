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
public class UpdateRequest {

	/**
	 * id of the entity to be updated.
	 */
	private long id;

}
