package com.musicrus;

import java.io.Serializable;

public class Electric extends Guitar implements Powered, Serializable {

	public Electric(int year, String make) {
		super(year, make);
	}
	
	@Override
	public String play() {
		return "crunch";
	}
}
