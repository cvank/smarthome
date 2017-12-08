/**
 * 
 */
package com.turvo.assesment.core.event.publisher;

/**
 * Child classes want to publish their changes to listener implement publisher.
 * 
 * @author chandrashekarv
 *
 */
public interface SmartHomePublisher {

	public boolean publish();
}
