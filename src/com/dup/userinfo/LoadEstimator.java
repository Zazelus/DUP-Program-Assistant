package com.dup.userinfo;

public class LoadEstimator {

	private double trainingMax;

	public LoadEstimator() {

	}

	public double estimateTrainingMax(double currentMax) {
		trainingMax = currentMax * .925;

		return trainingMax;
	}

	public double estimateLoad(double trainingMax, int repCount) {
		double estimatedLoad = 0;

		// Formula with currentMax and repCount to estimate load for current rep count.

		return estimatedLoad;
	}

	public double estimateMaxLoad(double repWeight, int repCount) {
		double estimatedLoad = 0;

		// Formula Tbd.

		return estimatedLoad;
	}

	public double estimateProjectedMax(int weeks) {
		double estimatedMaxLoad = 0;

		// Will use data from UserData to determine.

		return estimatedMaxLoad;
	}


}
