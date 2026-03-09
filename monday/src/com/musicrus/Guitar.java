package com.musicrus;

import java.util.List;
import java.util.ArrayList;

public abstract class Guitar implements Playable, Comparable<Guitar> {
	private int year;
	private String make;
	private List<GuitarString> strings;
	
	public int compareTo(Guitar other) {
//		return this.make.compareTo(other.make);
		
		int result = this.make.compareTo(other.getMake());
		
		if (result == 0) {
			if(this.year < other.year) {
				return -1;
			} else if(this.year > other.year) {
				return 1;
			}
		}
		return result;
		
	}

	public Guitar(int year, String make) {
		this.year = year;
		this.make = make;
		this.strings = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			strings.add(new GuitarString());
		}
	}

	public Guitar(Guitar eg) {
		this.year = eg.year;
		this.make = eg.make;
		this.strings = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			strings.add(new GuitarString());
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void breakString() {
		strings.remove(0);
	}

	public int getNumberOfStrings() {
		return strings.size();
	}

	@Override
	public String toString() {
		return year + " " + make + " with " + getNumberOfStrings();
	}

}
