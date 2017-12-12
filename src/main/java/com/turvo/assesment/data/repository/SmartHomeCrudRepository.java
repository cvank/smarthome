/**
 * 
 */
package com.turvo.assesment.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.turvo.assesment.data.entity.SmartHome;


/**
 * @author chandrashekarv
 *
 */
public interface SmartHomeCrudRepository extends MongoRepository<SmartHome, Long> {

}
