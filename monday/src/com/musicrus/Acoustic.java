package com.musicrus;

public class Acoustic extends Guitar {

	public Acoustic(int year, String make) {
		super(year, make);
	}
	
	public Acoustic(Guitar original) {
		super(original);
	}
	
	@Override
	public String play() {
		return "twang";
	}
}
