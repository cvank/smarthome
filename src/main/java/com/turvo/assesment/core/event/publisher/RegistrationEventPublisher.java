/**
 * 
 */
package com.turvo.assesment.core.event.publisher;

import com.turvo.assesment.core.event.listener.EventListener;

/**
 * RegistrationEventPublisher : Registers the incoming registration event.
 * 
 * @author chandrashekarv
 *
 */
public class RegistrationEventPublisher extends SmartHomeEventPublisher {

	public RegistrationEventPublisher(EventListener listener) {
		super(listener);
	}

	@Override
	public Object publish(final Object obj) {
		return listener.register(obj);
	}

}
