package com.turvo.assesment.core.listener;

/**
 * SmartHomeListener : Interface that will be implemented by listener classes to
 * listen to respective entity's activity.
 * 
 * @author chandrashekarv
 *
 */
public interface SmartHomeListener {

	public boolean register();

	public boolean deRegister();
}
