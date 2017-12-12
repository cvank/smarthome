/**
 * 
 */
package com.turvo.assesment.core.data.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author chandrashekarv
 *
 */
public class AttributeData {

	private Map<String, Object> attributes;

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	/**
	 * Adds attribute to the attribute data.
	 * 
	 * @param key
	 * @param value
	 */
	public void addAttribute(final String key, final Object value) {
		if (Objects.isNull(attributes))
			attributes = new HashMap<>();

		attributes.put(key, value);
	}

	/**
	 * Adds given multiple attributes to the attribute data.
	 * 
	 * @param map
	 */
	public void addAttribute(final Map<String, Object> map) {
		if (Objects.isNull(attributes))
			attributes = new HashMap<>();

		attributes.putAll(map);
	}

}
