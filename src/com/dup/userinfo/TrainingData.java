package com.dup.userinfo;

public class TrainingData {

	private double squatMax;
	private double benchMax;
	private double deadliftMax;

	public TrainingData() {

	}

	public TrainingData(double squat, double bench, double deadlift) {
		squatMax = squat;
		benchMax = bench;
		deadliftMax = deadlift;
	}

	public double getSquatMax() {
		return squatMax;
	}

	public double getBenchMax() {
		return benchMax;
	}

	public double getDeadliftMax() {
		return deadliftMax;
	}

}
