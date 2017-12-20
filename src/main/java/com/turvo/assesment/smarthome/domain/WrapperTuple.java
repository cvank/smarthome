/**
 * 
 */
package com.turvo.assesment.smarthome.domain;

/**
 * @author chandrashekarv
 *
 */
public class WrapperTuple<S, T> {

	private S s;

	private T t;

	public WrapperTuple(S s, T t) {
		super();
		this.s = s;
		this.t = t;
	}

	public S getS() {
		return s;
	}

	public void setS(S s) {
		this.s = s;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
