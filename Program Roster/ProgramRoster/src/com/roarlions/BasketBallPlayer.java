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
public class BasketBallPlayer extends Player {
	
	/**
	 * Basketball player fields
	 */
	private Integer careerPoints = 0;

	/**
	 * @return the careerPoints
	 */
	public Integer getCareerPoints() {
		return careerPoints;
	}

	/**
	 * @param careerPoints the careerPoints to set
	 */
	public void setCareerPoints(Integer careerPoints) {
		this.careerPoints = careerPoints;
	}
	/**
	 * prints this players data
	 */
	@Override
	public String toString() {
		return super.getName() + " is # " + super.getJerseyNumber();
	}
	

}
