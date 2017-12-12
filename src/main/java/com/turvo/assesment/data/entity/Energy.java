/**
 * 
 */
package com.turvo.assesment.data.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author chandrashekarv
 *
 */
@Document(collection = "energy")
public class Energy {

	@Id
	private long id;

	private String name;

	private Date createdDate;

	private Date lastmodifiedDate;

	private AttributeData data;

	public AttributeData getData() {
		return data;
	}

	public void setData(AttributeData data) {
		this.data = data;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastmodifiedDate() {
		return lastmodifiedDate;
	}

	public void setLastmodifiedDate(Date lastmodifiedDate) {
		this.lastmodifiedDate = lastmodifiedDate;
	}

}
