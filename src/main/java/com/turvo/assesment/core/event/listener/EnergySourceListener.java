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
	public Object register(Object obj) {
		return false;
	}

	@Override
	public Object deRegister(final long id) {
		return false;
	}

}
