/**
 * 
 */
package com.turvo.assesment.core.event.publisher;

import com.turvo.assesment.core.event.listener.EventListener;

/**
 * SmartHomeEventPublisher : Abstracts out various smart home events.
 * 
 * @author chandrashekarv
 *
 */
public abstract class SmartHomeEventPublisher implements SmartHomePublisher {

	public EventListener listener;

	public SmartHomeEventPublisher(EventListener listener) {
		super();
		this.listener = listener;
	}

	@Override
	public abstract boolean publish(final Object obj);

}
