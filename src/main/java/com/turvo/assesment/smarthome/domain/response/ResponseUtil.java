/**
 * 
 */
package com.turvo.assesment.smarthome.domain.response;

import com.turvo.assesment.smarthome.domain.BaseRequest;
import com.turvo.assesment.smarthome.domain.response.SmartHomeResponse.SmarthomeResponseBuilder;

/**
 * @author chandrashekarv
 *
 */
public final class ResponseUtil {

	public static SmartHomeResponse homeResponse(final String homeId, final BaseRequest baseRequest) {
		return new SmarthomeResponseBuilder(homeId).withAdditionalData(baseRequest.getAdditionalRequestData()).build();

	}
}
