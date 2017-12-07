/**
 * 
 */
package com.turvo.assesment.core.device.factory;

import com.turvo.assesment.core.device.Device;

/**
 * AbstractSmartHomeFactory: Abstract factory to provide factory instances for
 * respective derived factory implementations.
 * 
 * @author chandrashekarv
 *
 */
public interface SmartHomeFactory {

	public Device createDevice();

}
