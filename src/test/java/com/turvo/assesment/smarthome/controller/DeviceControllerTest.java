/**
 * 
 */
package com.turvo.assesment.smarthome.controller;

import static org.junit.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyMap;
import static org.mockito.Matchers.anyString;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.turvo.assesment.core.SmartHomeEngine;
import com.turvo.assesment.smarthome.domain.AddDeviceRequest;
import com.turvo.assesment.smarthome.domain.BaseRequest;

/**
 * @author chandrashekarv
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class DeviceControllerTest {

	@MockBean
	private SmartHomeEngine smartHomeEngine;

	@Autowired
	private DeviceController deviceController;

	@Test
	public void testAdd() {

		given(this.smartHomeEngine.addDevice(anyString(), anyString(), anyMap(), anyMap()))
				.willReturn("D123H1E1S1S2E2S3");
		BaseRequest baseRequest = new AddDeviceRequest();
		assertNotNull(deviceController.add(baseRequest));

	}

}
