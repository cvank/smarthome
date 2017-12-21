/**
 * 
 */
package com.turvo.assesment.core.device.feed;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.turvo.assesment.smarthome.domain.DeviceFeedRequest;

import rx.schedulers.Schedulers;

/**
 * @author chandrashekarv
 *
 */
@Component
public class DataFeedProcessor {

	private static final Logger LOG = LoggerFactory.getLogger(DataFeedProcessor.class);

	@Autowired
	DataFeedQueueAccessor dataFeedQueueAccessor;

	@PostConstruct
	public void startTracking() {
		dataFeedQueueAccessor.accessQueue().subscribeOn(Schedulers.computation()).subscribe(this::track,
				this::handleError);
	}

	public void handleError(Throwable throwable) {
		LOG.error("Error:" + throwable.getMessage());
	}

	public void track(DeviceFeedRequest feedRequest) {
		// Persist data to mongo.

	}
}
