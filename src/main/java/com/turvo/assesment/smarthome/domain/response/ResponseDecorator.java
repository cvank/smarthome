/**
 * 
 */
package com.turvo.assesment.smarthome.domain.response;

import java.io.FileNotFoundException;

/**
 * @author chandrashekarv
 *
 */
public abstract class ResponseDecorator implements Response {

	private SmartHomeResponse response;

	public ResponseDecorator(SmartHomeResponse response) {
		super();
		this.response = response;
	}

	public SmartHomeResponse getResponse() {
		return response;
	}

	public void setResponse(SmartHomeResponse response) throws FileNotFoundException { 
		this.response = response;
	}

	@Override
	public abstract Response construct();

}
