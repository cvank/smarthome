/**
 * 
 */
package com.turvo.assesment.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.turvo.assesment.data.entity.Energy;

/**
 * @author chandrashekarv
 *
 */
public interface EnergyCrudRepository extends MongoRepository<Energy, String> {

}
