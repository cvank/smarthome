/**
 * 
 */
package com.turvo.assesment.core.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.turvo.assesment.core.data.entity.SmartHome;


/**
 * @author chandrashekarv
 *
 */
public interface SmartHomeRepository extends MongoRepository<SmartHome, Long> {

}
