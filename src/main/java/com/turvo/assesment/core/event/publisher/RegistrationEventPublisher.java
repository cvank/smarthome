/**
 * 
 */
package com.turvo.assesment.core.event.publisher;

import com.turvo.assesment.core.event.listener.SmartHomeListener;

/**
 * RegistrationEventPublisher : Registers the incoming registration event.
 * 
 * @author chandrashekarv
 *
 */
public class RegistrationEventPublisher extends SmartHomeEventPublisher {

	public RegistrationEventPublisher(SmartHomeListener listener) {
		super(listener);
	}

	@Override
	public boolean publish() {
		return listener.register();
	}

}
