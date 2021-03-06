/**
 * 
 */
package com.turvo.assesment.data.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.data.mongodb.core.ExecutableFindOperation.ExecutableFind;
import org.springframework.data.mongodb.core.ExecutableUpdateOperation.ExecutableUpdate;*/
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.util.CloseableIterator;

import com.mongodb.WriteResult;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

/**
 * Base Repository gets extended by all derived child repository classes.
 * Provides generic operations required for all repositories.
 * 
 * TODO: Chose required base repository at run time, hence can be extended the
 * functionality for any DB that supports Spring-Data. make use of strategy
 * pattern for the same.
 * 
 * 
 * @author chandrashekarv
 *
 */
public abstract class BaseRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	public abstract <T, ID extends Serializable> CrudRepository<T, ID> crudRepository();

	public <T> T save(final T t) {
		return crudRepository().save(t);
	}

	public WriteResult upsert(Query query, Update update, Class<?> entityClass) {
		return mongoTemplate.upsert(query, update, entityClass);
	}

	public WriteResult upsert(Query query, Update update, Class<?> entityClass, final String collectionName) {
		return mongoTemplate.upsert(query, update, entityClass, collectionName);
	}

	public WriteResult upsert(Query query, Update update, final String collectionName) {
		return mongoTemplate.upsert(query, update, collectionName);
	}

	public WriteResult deleteMongoDocument(Object object) {
		return mongoTemplate.remove(object);
	}

	public WriteResult deleteMongoDocument(Object object, final String collectionName) {
		return mongoTemplate.remove(object, collectionName);
	}

	public boolean isCollectionExists(Class<?> entityClass) {
		return mongoTemplate.collectionExists(entityClass);
	}

	public boolean isCollectionExists(final String collectionName) {
		return mongoTemplate.collectionExists(collectionName);
	}

/*	public <T> ExecutableFind<T> query(final Class<T> domainType) {
		return mongoTemplate.query(domainType);
	}

	public <T> List<T> queryAsList(final Class<T> domainType) {
		return mongoTemplate.query(domainType).all();
	}

	public <T> ExecutableUpdate<T> update(final Class<T> domainType) {
		return mongoTemplate.update(domainType);
	}*/
	
	/**
	 * For earlier versions of Mongo.
	 * 
	 * @param domainType
	 * @return
	 */
	public <T> List<T> queryAsList(final Class<T> domainType) {
		return mongoTemplate.findAll(domainType);
	}

	public <T> CloseableIterator<T> update(Query query, final Class<T> entityType) {
		return mongoTemplate.stream(query, entityType);
	}

	public <T> CloseableIterator<T> update(Query query, final Class<T> entityType, final String collectionName) {
		return mongoTemplate.stream(query, entityType, collectionName);
	}

	public <T> void saveOrUpdate(T t) {
		mongoTemplate.save(t);
	}

	public <T> void saveOrUpdate(T t, final String collectionName) {
		mongoTemplate.save(t, collectionName);
	}

	public <T> void delete(final T t) {
		crudRepository().delete(t);
	}

}
