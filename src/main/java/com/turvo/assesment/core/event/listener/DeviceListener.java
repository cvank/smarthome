/**
 * 
 */
package com.turvo.assesment.core.event.listener;

/**
 * @author chandrashekarv
 *
 */
public class DeviceListener implements SmartHomeListener {

	@Override
	public boolean register(Object obj) {
		
		return false;
	}

	@Override
	public boolean deRegister(final long id) {

		return false;
	}

}
