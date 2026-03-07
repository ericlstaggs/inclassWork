/**
 * 
 */
package com.roarlions;

/**
 * This is a class  Basket ball Player
 * extends Player 
 * 
 * @version 1.0 3/6/2026
 * @author Eric Staggs
 */
public class BaseBallPlayer extends Player{
	/**
	 * Baseball player fields
	 */
	private Integer homeRuns = 0;

	/**
	 * @return the homeRuns
	 */
	public Integer getHomeRuns() {
		return homeRuns;
	}

	/**
	 * @param homeRuns the homeRuns to set
	 */
	public void setHomeRuns(Integer homeRuns) {
		this.homeRuns = homeRuns;
	}
	/**
	 * prints this players values
	 */
	@Override
	public String toString() {
		return super.getName() + " is # " + super.getJerseyNumber();
	}
	

}
