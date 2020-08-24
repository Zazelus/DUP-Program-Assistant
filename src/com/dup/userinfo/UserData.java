package com.dup.userinfo;

public class UserData {

	private String userName;
	private int userAge;
	private char userGender;
	private double userWeight;

	public UserData() {

	}

	public UserData(String name, int age, char gender, double weight) {
		userName = name;
		userAge = age;
		userGender = gender;
		userWeight = weight;
	}

	public String getUserName() {
		return userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public char getUserGender() {
		return userGender;
	}

	public double getUserWeight() {
		return userWeight;
	}

}
