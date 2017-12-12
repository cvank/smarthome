/**
 * 
 */
package com.turvo.assesment.data.service;

import java.util.List;

import com.turvo.assesment.data.repository.BaseRepository;

/**
 * Generic base service class extended by derived child service class. This
 * class provides basic operations across all the classes.
 * 
 * @author chandrashekarv
 *
 */
public abstract class BaseService {

	public abstract <T extends BaseRepository> T repository();

	public <T> List<T> fetchAll(Class<T> t) {
		return repository().queryAsList(t);
	}

	public <T> T add(T t) {
		return repository().save(t);

	}

	public <T> void delete(T t) {
		repository().delete(t);

	}

	public <T> void saveOrUpdate(T t) {
		repository().saveOrUpdate(t);
	}
}
