/**
 * 
 */
package com.turvo.assesment.core.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.turvo.assesment.core.data.entity.Device;

/**
 * @author chandrashekarv
 *
 */
public interface DeviceRepository extends MongoRepository<Device, Long> {

}
