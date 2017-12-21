/**
 * 
 */
package com.turvo.assesment.smarthome.domain.response;

/**
 * @author chandrashekarv
 *
 */
public class SuccessResponse extends ResponseDecorator {

	public SuccessResponse(SmartHomeResponse response) {
		super(response);
	}

	@Override
	public Response construct() {
		// Add any details respective to success response.
		
		return null;
	}

}
