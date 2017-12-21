/**
 * 
 */
package com.turvo.assesment.core.device.feed;

import org.springframework.stereotype.Component;

import com.turvo.assesment.smarthome.domain.DeviceFeedRequest;

import rx.Observable;

/**
 * @author chandrashekarv
 *
 */
@Component
public class DataFeedQueueAccessor {

	private DataFeedQueue<DeviceFeedRequest> dataFeedRequestQueue = new DataFeedQueue<>();

	public Observable<DeviceFeedRequest> accessQueue() {

		return dataFeedRequestQueue.accessDataFeedQueue();
	}

	public void addFeedRequestToQueue(DeviceFeedRequest deviceFeedRequest) {
		dataFeedRequestQueue.addToQueue(deviceFeedRequest);
	}
}
