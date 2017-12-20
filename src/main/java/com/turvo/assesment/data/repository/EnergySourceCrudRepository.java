/**
 * 
 */
package com.turvo.assesment.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.turvo.assesment.data.entity.EnergySource;

/**
 * @author chandrashekarv
 *
 */
public interface EnergySourceCrudRepository extends MongoRepository<EnergySource, String> {

}
