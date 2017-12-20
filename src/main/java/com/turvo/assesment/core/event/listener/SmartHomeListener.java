/**
 * 
 */
package com.turvo.assesment.core.event.listener;

import org.springframework.stereotype.Component;

/**
 * @author chandrashekarv
 *
 */
@Component("home")
public class SmartHomeListener implements EventListener {

	@Override
	public boolean register(Object obj) {

		return false;
	}

	@Override
	public boolean deRegister(long id) {

		return false;
	}

}
