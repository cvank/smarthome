/**
 * 
 */
package com.turvo.assesment.smarthome.domain.response;

/**
 * @author chandrashekarv
 *
 */
public class FailureResponse extends ResponseDecorator {

	public FailureResponse(SmartHomeResponse response) {
		super(response);
	}

	@Override
	public Response construct() {
		// Add any details respective to failure response.
		return null;
	}


}
