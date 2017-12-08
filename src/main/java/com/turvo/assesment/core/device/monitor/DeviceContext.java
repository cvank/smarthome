/**
 * 
 */
package com.turvo.assesment.core.device.monitor;

/**
 * DeviceContext: Holds current state of the device and controls calling next
 * state.
 * 
 * @author chandrashekarv
 *
 */
public class DeviceContext {

	/**
	 * Represents the current state of the device.
	 * 
	 */
	private DeviceState currentState;

	public DeviceContext(DeviceState currentState) {
		super();
		this.currentState = currentState;
	}

	/**
	 * Triggers process() on next state assigned.
	 */
	public void next() {
		currentState.process();
	}

	public void setCurrentState(DeviceState currentState) {
		this.currentState = currentState;
	}

}
