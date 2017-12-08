package com.turvo.assesment.core;

/**
 * 
 * Generic tuple pojo for holding two types.
 * 
 * @author chandrashekarv
 *
 */
public class Tuple<T1, T2> {
	private T1 t1;
	private T2 t2;

	public Tuple(final T1 t1, final T2 t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
}