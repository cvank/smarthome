/**
 * 
 */
package com.turvo.assesment.track;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.turvo.assesment.core.Tuple;
import com.turvo.assesment.core.device.MultiConsumptionDevice;
import com.turvo.assesment.core.device.SingleConsumptionDevice;
import com.turvo.assesment.core.device.SmartHomeDevice;

import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * @author chandrashekarv
 *
 */
public enum DeviceConsumptionAnalyzer implements ConsumptionAnalyzer {

	INSTANCE;

	@Override
	public AnalysisData analyze(Object obj) {

		if (obj instanceof SingleConsumptionDevice) {
			return analyseSingleConsumptionDevice(obj);
		} else if (obj instanceof MultiConsumptionDevice) {
			return analyseMultiConsumptionDevice(obj);
		}

		// analyze device consumption.

		return null;
	}

	/**
	 * Consumption for multi consumption device.
	 * 
	 * @param obj
	 * @return
	 */
	private AnalysisData analyseMultiConsumptionDevice(Object obj) {
		MultiConsumptionDevice device = (MultiConsumptionDevice) obj;

		// for the single device access energy utilized.
		List<AnalysisData> deviceAnalysisData = new CopyOnWriteArrayList<>();
		Observable.from(device.accessDeviceEnergyData()).subscribeOn(Schedulers.computation())
				.map(item -> fetchFromEnergy(item, device)).doOnNext(e -> deviceAnalysisData.add(e));

		return null;
	}

	/**
	 * Fetch consumption based per energy.
	 * 
	 * @param tuple
	 * @return
	 */
	private AnalysisData fetchFromEnergy(Tuple<String, List<String>> tuple, final SmartHomeDevice device) {

		// For each energy fetch consumption per energy source.

		return null;
	}

	/**
	 * Consumption Analysis for singleConsumptionDevice.
	 * 
	 * @param obj
	 * @return
	 */
	private AnalysisData analyseSingleConsumptionDevice(Object obj) {
		SingleConsumptionDevice device = (SingleConsumptionDevice) obj;

		// for the single device access energy utilized.
		List<AnalysisData> deviceAnalysisData = new CopyOnWriteArrayList<>();
		Observable.just(device.accessDeviceEnergyData()).subscribeOn(Schedulers.computation())
				.map(tuple -> fetchFromEnergy(tuple, device)).doOnNext(e -> deviceAnalysisData.add(e));

		// for the multi device access energy utilized.

		return null;
	}

}
