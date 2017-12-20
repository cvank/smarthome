/**
 * 
 */
package com.turvo.assesment.smarthome.domain;

/**
 * @author chandrashekarv
 *
 */
public class Wrapper<T> {

	private T t;

	public Wrapper(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
