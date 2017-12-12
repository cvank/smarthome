/**
 * 
 */
package com.turvo.assesment.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.turvo.assesment.data.entity.Device;

/**
 * @author chandrashekarv
 *
 */
public interface DeviceCrudRepository extends MongoRepository<Device, Long> {

}
