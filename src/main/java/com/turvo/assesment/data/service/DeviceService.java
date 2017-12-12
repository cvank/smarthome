/**
 * 
 */
package com.turvo.assesment.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turvo.assesment.data.repository.BaseRepository;
import com.turvo.assesment.data.repository.DeviceRepository;

/**
 * @author chandrashekarv
 *
 */
@Service
public class DeviceService extends BaseService {

	@Autowired
	DeviceRepository deviceRepository;
	
	@Override
	public <T extends BaseRepository> T repository() {
		
		return null;
	}

}
