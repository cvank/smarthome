/**
 * 
 */
package com.turvo.assesment.core.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.turvo.assesment.core.data.entity.EnergySource;

/**
 * @author chandrashekarv
 *
 */
public interface EnergySourceCrudRepository extends MongoRepository<EnergySource, Long> {

}
