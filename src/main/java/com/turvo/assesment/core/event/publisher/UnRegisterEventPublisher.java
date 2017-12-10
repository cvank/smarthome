/**
 * 
 */
package com.turvo.assesment.core.event.publisher;

import com.turvo.assesment.core.event.listener.SmartHomeListener;

/**
 * RegistrationEventPublisher : UnRegisters the incoming event.
 * 
 * @author chandrashekarv
 *
 */
public class UnRegisterEventPublisher extends SmartHomeEventPublisher {

	public UnRegisterEventPublisher(SmartHomeListener listener) {
		super(listener);
	}

	@Override
	public boolean publish(final Object id) {
		long l  = (long) id; 
		listener.deRegister(l);
		return false;
	}

}
