/**
 * 
 */
package com.turvo.assesment.core.inbound;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author chandrashekarv
 *
 */
@Scope("request")
@Component
public class AttributeData implements Serializable {

	private static final long serialVersionUID = 1386658204088805910L;

	private Map<String, Object> attributes = new ConcurrentHashMap<>();

	private String attributeCategory;

	public String getAttributeCategory() {
		return attributeCategory;
	}

	public void setAttributeCategory(String attributeCategory) {
		this.attributeCategory = attributeCategory;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

}
