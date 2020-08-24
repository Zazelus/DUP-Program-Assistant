package com.dup.events;

public class StartEvent {

	private String userName;
	private int userAge;
	private char userGender;
	private double userWeight;

	public StartEvent() {
		start();
	}

	public void start() {
		createUser();
	}

	public void createUser() {

	}

}
