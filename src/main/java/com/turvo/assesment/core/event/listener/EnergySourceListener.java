/**
 * 
 */
package com.turvo.assesment.core.event.listener;

import org.springframework.stereotype.Component;

/**
 * @author chandrashekarv
 *
 */
@Component("energy-source")
public class EnergySourceListener implements EventListener {

	@Override
	public boolean register(Object obj) {
		return false;
	}

	@Override
	public boolean deRegister(final long id) {
		return false;
	}

}
