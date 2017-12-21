/**
 * 
 */
package com.turvo.assesment.data.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.turvo.assesment.data.entity.Device;

/**
 * @author chandrashekarv
 *
 */
@RunWith(SpringRunner.class)
@DataMongoTest
public class DeviceCrudRepositoryTest {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	private DeviceCrudRepository deviceCrudRepository;

	@Test
	public void testFindByOne() {
		Device device = new Device();
		device = this.deviceCrudRepository.save(device);
		assertNotNull(device.getDeviceId());
		assertTrue(this.mongoTemplate.collectionExists(Device.class));

	}
}
