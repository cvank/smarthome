/**
 * 
 */
package com.turvo.assesment.core.event.publisher;

import com.turvo.assesment.core.event.listener.SmartHomeListener;

/**
 * SmartHomeEventPublisher : Abstracts out various smart home events.
 * 
 * @author chandrashekarv
 *
 */
public abstract class SmartHomeEventPublisher implements SmartHomePublisher {

	public SmartHomeListener listener;

	public SmartHomeEventPublisher(SmartHomeListener listener) {
		super();
		this.listener = listener;
	}

	@Override
	public abstract boolean publish();

}
