/**
 * 
 */
package com.turvo.assesment.core;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.turvo.assesment.core.event.listener.EventListener;
import com.turvo.assesment.core.event.publisher.RegistrationEventPublisher;
import com.turvo.assesment.core.event.publisher.SmartHomePublisher;
import com.turvo.assesment.core.event.publisher.UnRegisterEventPublisher;
import com.turvo.assesment.smarthome.domain.EntityType;

/**
 * @author chandrashekarv
 *
 */
@Component
public class PublisherFactory {

	@Autowired
	@Qualifier("device")
	EventListener deviceListener;

	@Autowired
	@Qualifier("energy")
	EventListener energyListener;

	@Autowired
	@Qualifier("energy-source")
	EventListener energySourceListener;

	@Autowired
	@Qualifier("home")
	EventListener smartHomeListener;

	public Optional<SmartHomePublisher> getPublisher(final EventType eventType, final EntityType entityType) {
		switch (entityType) {
		case DEVICE:
			return Optional.ofNullable(devicePublisher(eventType));

		case HOME:
			return Optional.ofNullable(homePublisher(eventType));

		case ENERGY:
			return Optional.ofNullable(energyPublisher(eventType));
		case ENERGY_SOURCE:
			return Optional.ofNullable(energySourcePublisher(eventType));

		}
		return Optional.empty();
	}

	private SmartHomePublisher energySourcePublisher(EventType eventType) {
		return null;
	}

	private SmartHomePublisher energyPublisher(EventType eventType) {

		return null;
	}

	private SmartHomePublisher homePublisher(EventType eventType) {

		return null;
	}

	private SmartHomePublisher devicePublisher(final EventType eventType) {
		switch (eventType) {
		case REGISTER:
			return new RegistrationEventPublisher(deviceListener);
		case DEREGISTER:
			return new UnRegisterEventPublisher(deviceListener);
		case UPDATE:
			return new UnRegisterEventPublisher(deviceListener);
		}

		return null;
	}
}
