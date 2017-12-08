/**
 * 
 */
package com.turvo.assesment.core;

import java.io.Serializable;

/**
 * @author chandrashekarv
 *
 */
public class HomeDetails implements Serializable {

	private static final long serialVersionUID = 2194948105819111492L;

	private String homeName;
	private String dateAdded;
	private String type;
	private String address;

	public String getHomeName() {
		return homeName;
	}

	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
