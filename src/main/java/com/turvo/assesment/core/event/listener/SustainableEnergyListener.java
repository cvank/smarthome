/**
 * 
 */
package com.turvo.assesment.core.event.listener;

import org.springframework.stereotype.Component;

/**
 * @author chandrashekarv
 *
 */
@Component("energy")
public class SustainableEnergyListener implements EventListener {

	@Override
	public Object register(Object obj) {

		return false;
	}

	@Override
	public Object deRegister(long id) {

		return false;
	}

}
