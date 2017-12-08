/**
 * 
 */
package com.turvo.assesment.track;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import com.turvo.assesment.core.Consumption;
import com.turvo.assesment.core.SmartHome;
import com.turvo.assesment.core.device.SingleConsumptionDevice;
import com.turvo.assesment.core.device.SmartHomeDevice;

import rx.Observable;
import rx.Scheduler;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * SmartHomeConsumtionAnalyzer : Analyzes consumption for a home.
 * 
 * @author chandrashekarv
 *
 */
public enum SmartHomeConsumtionAnalyzer implements ConsumptionAnalyzer {

	INSTANCE;

	@Override
	public AnalysisData analyze(Object obj) {

		SmartHome smartHome = (SmartHome) obj;
		AnalysisData analysisData = new AnalysisData(calculateConsumption(smartHome),
				smartHome.getHomeDetails().getType());

		// Analyze for smartHome.
		return analysisData;
	}

	private Consumption calculateConsumption(final SmartHome smartHome) {

		/*
		 * Calculate consumption of the home. Ideally iterate through each device and
		 * calculate consumption intern for each energy and respective energy source.
		 */

		List<AnalysisData> deviceAnalysisData = new CopyOnWriteArrayList<>();
		Observable.from(smartHome.accessDevices()).subscribeOn(Schedulers.computation()).map(this::fetchForDevice)
				.doOnNext(e -> deviceAnalysisData.add(e));

		return null;
	}

	/**
	 * Fetches Energy consumption for the device and returns AnalysisData as
	 * response.
	 * 
	 * @param device
	 * @return
	 */
	private AnalysisData fetchForDevice(SmartHomeDevice device) {
		return DeviceConsumptionAnalyzer.INSTANCE.analyze(device);

	}

}
