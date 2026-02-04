package com.carsrus;


public class Car {
	// fields
	private int year;
	private String make; 
	private boolean manualTransmission;
	
	public Car(int year, String make, boolean mt) {
		this.year = year;
		this.make = make;
		manualTransmission = mt;
	}
	
	public Car() {
		this(2000, "Kia", false);
	}
	
	public String toString() {
		return year + " " + make + " " + manualTransmission;
	}
	
	// getters (accessor)
	public int getYear() {
		return year;
	}

	public String getMake() {
	    return make;
	}

	// XXX (quiz)
	public boolean getManualTransmission() {
	    return manualTransmission;
	}
	
	// setters (mutators)
	public void setYear(int year) {
		// quiz
		this.year = year;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setManualTransmission(boolean man) {
		this.manualTransmission = man;
	}
}
