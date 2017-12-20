/**
 * 
 */
package com.turvo.assesment.smarthome.domain;

import java.util.Optional;

/**
 * @author chandrashekarv
 *
 */
public final class EnumLookupUtil {

	/**
	 * Looks up for the Enum type against the given String value and Enum Class.
	 * 
	 * @param enumClazz
	 * @param stringValue
	 * @return
	 */
	public static <T extends Enum<T>> Optional<T> lookup(Class<T> enumClazz, String stringValue) {
		try {

			return Optional.ofNullable(Enum.valueOf(enumClazz, stringValue));
		} catch (Exception e) {
			// TODO: log the excetpion
			e.printStackTrace(); 
		}
		return Optional.empty();

	}
	
	public static void main(String[] args) {
		System.out.println(EnumLookupUtil.lookup(RequestType.class, "ADD"));

	}
}
