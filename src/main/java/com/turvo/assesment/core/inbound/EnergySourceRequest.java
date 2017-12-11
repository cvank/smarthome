/**
 * 
 */
package com.turvo.assesment.core.inbound;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author chandrashekarv
 *
 */
@Scope("request")
@Component
public class EnergySourceRequest implements Serializable {

	private static final long serialVersionUID = 1448279813480640105L;

	private String name;

	private AttributeData attributeData;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AttributeData getAttributeData() {
		return attributeData;
	}

	public void setAttributeData(AttributeData attributeData) {
		this.attributeData = attributeData;
	}

}
