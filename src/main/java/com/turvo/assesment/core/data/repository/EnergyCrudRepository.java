/**
 * 
 */
package com.turvo.assesment.core.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.turvo.assesment.core.data.entity.Energy;

/**
 * @author chandrashekarv
 *
 */
public interface EnergyCrudRepository extends MongoRepository<Energy, Long> {

}
