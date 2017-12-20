/**
 * 
 */
package com.turvo.assesment.data.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.turvo.assesment.data.entity.Device;

/**
 * @author chandrashekarv
 *
 */
@Repository
public class DeviceRepository extends BaseRepository {

	@Autowired
	DeviceCrudRepository deviceCrudRepository;
	
	@Override
	public CrudRepository<Device, String> crudRepository() {
		return deviceCrudRepository;
	}

}
