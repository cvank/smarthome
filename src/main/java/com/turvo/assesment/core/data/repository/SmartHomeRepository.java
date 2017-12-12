/**
 * 
 */
package com.turvo.assesment.core.data.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.turvo.assesment.core.data.entity.SmartHome;

/**
 * @author chandrashekarv
 *
 */
@Repository
public class SmartHomeRepository extends BaseRepository {

	@Autowired
	SmartHomeCrudRepository smartHomeCrudRepository;

	@SuppressWarnings("unchecked")
	@Override
	public CrudRepository<SmartHome, Long> crudRepository() {
		return smartHomeCrudRepository;

	}

}
