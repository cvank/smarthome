/**
 * 
 */
package com.turvo.assesment.core.inbound;

import java.io.Serializable;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author chandrashekarv
 *
 */
@Scope("request")
@Component
public class HomeRequest implements Serializable {

	private static final long serialVersionUID = -9214619207795867116L;

	private String name;

	private String address;

	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
