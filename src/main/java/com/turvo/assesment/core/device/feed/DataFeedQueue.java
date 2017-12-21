/**
 * 
 */
package com.turvo.assesment.core.device.feed;

import rx.Observable;
import rx.subjects.PublishSubject;

/**
 * @author chandrashekarv
 *
 */
public class DataFeedQueue<T> {

	PublishSubject<T> feedQueue;

	public DataFeedQueue() {
		this.feedQueue = PublishSubject.<T>create();
	}

	public void addToQueue(T t) {
		feedQueue.onNext(t);
	}

	public Observable<T> accessDataFeedQueue() {
		return feedQueue.asObservable();
	}

}
