/**
 * 
 */
package com.turvo.assesment.score;

import com.turvo.assesment.core.SmartHome;
import com.turvo.assesment.core.device.SmartHomeDevice;
import com.turvo.assesment.core.Duration;

/**
 * ScoreEngine: Generates scores for the given home, time frame, device etc.
 * 
 * @author chandrashekarv
 *
 */
public class ScoreEngine {

	/**
	 * Generate score for entire time frame for the given home and considers all the
	 * devices available.
	 * 
	 * @param home
	 * @return
	 */
	public double generateScore(final SmartHome home) {

		return 0;
	}

	/**
	 * Generate score for the given home and for the given duration. Ex:For the
	 * given time value as 2 and for the given duration as DAY represents 2 DAYS
	 * together. Hence generates score for the last 2 days from current time.
	 * 
	 * @param home
	 * @param time
	 * @param duration
	 *            - duration could represent either Day, month, year, minutes etc.
	 * @return
	 */
	public double generateScore(final SmartHome home, final int time, final Duration duration) {

		return 0;
	}

	/**
	 * Generate score for the given device till current time span.
	 * 
	 * @param device
	 * @return
	 */
	public double generateScore(final SmartHomeDevice device) {

		return 0;
	}

	/**
	 * Generate score for the given device and for the given time variant.
	 * 
	 * @param device
	 * @return
	 */
	public double generateScore(final SmartHomeDevice device, final int time, final Duration duration) {

		return 0;
	}

}
