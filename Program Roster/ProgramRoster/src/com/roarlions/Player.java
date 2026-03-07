/**
 * 
 */
package com.roarlions;

/**
 * This is an abstract class Player 
 * 
 * @version 1.0 3/6/2026
 * @author Eric Staggs
 */
public abstract class Player {
	
/*
 * Player fields
 */
	private String name = "";
	protected Byte jerseyNumber;
	
	/**
	 * @return jersey Number
	 */
	public Byte getJerseyNumber() {
		return jerseyNumber;
	}
	/**
	 * @param set jersey num
	 */
	public void setJerseyNum(Byte b) {
		this.jerseyNumber = b;
	}

	/**
	 * @return the name 
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * print the name and jersey Number of player
	 */
	
	public String toString() {
		return name + " is " + jerseyNumber;
	}
	
	
	

}
